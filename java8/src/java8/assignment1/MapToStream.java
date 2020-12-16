package java8.assignment1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToStream {

	public static void main(String[] args) {
		Map<String, String> emailPasswords = new HashMap<String, String>();

		Stream.generate(() -> "user" + new Random().nextInt(100) + "@gmail.com").limit(10).forEach(email -> {
			emailPasswords.put(email, "pass@" + new Random().nextFloat());
		});
		
		
		List<String> keyList = emailPasswords.keySet().stream().collect(Collectors.toList());
		List<String> valueList = emailPasswords.values().stream().collect(Collectors.toList());
	
		System.out.println(keyList);
		System.out.println(valueList);
	}

}
