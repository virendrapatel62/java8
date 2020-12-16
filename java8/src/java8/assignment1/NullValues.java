package java8.assignment1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NullValues {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Virendra" ,null ,  "Jabalpur" , null  , "Laptop" , null );
		
		Stream<String> notNullList = list.stream().filter(e->e!=null);
		
		notNullList.forEach(System.out::println);
	}

}
