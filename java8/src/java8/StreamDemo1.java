package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {

//		example1();
//		example2();
		supplierExample();

//		example4();

	}

	private static void example4() {
		IntStream intStream = "1234567890Virendra".chars();
//		intStream.forEach(System.out::println);

		Stream<String> stream = Stream.of("123.12.2.4".split("\\."));
		stream.forEach(System.out::println);
	}

	private static void supplierExample() {
		Supplier<Integer> inSupplier = () -> new Random().nextInt(100);
		Stream<Integer> integers = Stream.generate(inSupplier).parallel();
//		integers.limit(20).sorted().forEach(System.out::println);

//		integers.limit(5).filter(v->v<40).forEach(System.out::println);

//		integers
//		.limit(5)
//		.filter(v->v<40)
//		.map(v->v+100)
//		.forEach(System.out::println);

//		Integer result = integers
//		.limit(20)
//		.filter(v->v<40)
//		.map(v->v+100)
//		.reduce((v1 , v2)-> v1+)
//		.get();
//		
//		System.out.println(result);

//		Integer min = integers
//		.limit(100)
//		.map(e->{
//			System.out.println(e);
//			return e;
//		})
//		.min((i , j) -> i.compareTo(j)).get();
//		System.err.println("Minimum : ");
//		System.out.println(min);

		Integer max = integers.limit(100)

				.max((i, j) -> i.compareTo(j)).get();
		System.err.println("Minimum : ");
		System.out.println(max);
	}

	private static void example2() {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> iStream = integers.stream();
		iStream.forEach(System.out::println);
	}

	private static void example1() {
		Stream<Integer> integers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		integers.forEach(System.out::println);
	}

}
