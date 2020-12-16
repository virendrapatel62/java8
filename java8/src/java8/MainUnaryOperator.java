package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainUnaryOperator {

	public static void main(String[] args) {
		Function<Integer , Integer> function = x -> x*2;
		System.out.println(function.apply(2));
		
		UnaryOperator<Integer> unaryOperator = x-> x*2 ;
		System.out.println(unaryOperator.apply(3));
		
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(math(integers, unaryOperator));;
		
	}
	
	public static <T> List<T> math(List<T> list , UnaryOperator<T> unaryOperator){
		List<T> newList = new ArrayList<T>();
		for (T t : list) {
			newList.add(unaryOperator.apply(t));
		}
		return newList;
	}

}











