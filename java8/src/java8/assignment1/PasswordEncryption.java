package java8.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class PasswordEncryption {

	public static void main(String[] args) {
		Map<String, String> emailPasswords = new HashMap<String, String>();

		Stream
		.generate(() -> "user" + new Random().nextInt(100) + "@gmail.com")
		.limit(10)
		.forEach(email -> {
			emailPasswords.put(email, "pass@" + new Random().nextFloat());
		});

		Map<String, String> encrypedEmailPassowords = getEncryptedPasswords(emailPasswords);

		System.out.println(emailPasswords);
		System.out.println(encrypedEmailPassowords);

	}

	public static Map<String, String> getEncryptedPasswords(Map<String, String> emailPasswords) {
		Map<String, String> enPasswords = new HashMap<String, String>();
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		emailPasswords.forEach((key, value) -> {
			enPasswords.put(key, encryptor.encryptPassword(value));
		});

		return enPasswords;
	}
}
