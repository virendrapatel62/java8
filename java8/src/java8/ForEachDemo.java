package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import java8.consumers.EncryptDecryptConsumer;

public class ForEachDemo {
	
	public static void assignment1() {
		List<String> list = Arrays.asList("Virenda" , "Mohan" , "Sohan" , "Dell");
		EncryptDecryptConsumer consumer =  new EncryptDecryptConsumer();
		
		System.err.println("ENCRYPTED....");
		List<String> enc =consumer.encrypt(list);
		enc.forEach(System.out::println);
		
		System.err.println("DESCRYPED....");
		List<String> dec =consumer.decrypt(enc);
		dec.forEach(System.out::println);
	}

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
		
		assignment1();
		
		
		
	}

}
