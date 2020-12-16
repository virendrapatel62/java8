package java8.assignment1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EncyptDecrypt {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Virendra" , "Jabalpur" , "Ekta" , "Aditi");

		List<String> encryped = encrypt(list);
		System.out.println("---- encrypted------");
		System.out.println(encryped);
		
		List<String> decryped  = decrypt(encryped);
		System.out.println("---- decrypted------");
		System.out.println(decryped);
	
	}

	private static List<String> encrypt(List<String> list) {
		return list.stream().map(e -> {
			final StringBuilder builder = new StringBuilder();
			for (char c : e.toCharArray()) {
				builder.append(((char) (c + 10)) + "");
			}
			return builder.toString();
		}).collect(Collectors.toList());
	}
	
	private static List<String> decrypt(List<String> list) {
		return list.stream().map(e -> {
			final StringBuilder builder = new StringBuilder();
			for (char c : e.toCharArray()) {
				builder.append(((char) (c-10)) + "");
			}
			return builder.toString();
		}).collect(Collectors.toList());
	}
	
	
	
	
}
