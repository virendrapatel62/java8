package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
	
	

	public static void main2(String[] args) {
		List<String> list = Arrays.asList("Virenda" , "Mohan" , "Sohan" , "Dell");
		
//		list.forEach(e->System.out.println(e));
		list.forEach(System.out::println);
		list.forEach(ForEachDemo::doSomething);
	}
	
	public static void doSomething(String s) {
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Virenda" , "Mohan" , "Sohan" , "Dell");
//		list.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t.toUpperCase());
//			}
//		});
		
		
		
		
	}

}
