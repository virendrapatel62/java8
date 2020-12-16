package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MainBinaryOperator {

	public static void main(String[] args) {
		BiFunction<Integer, Float, Float> biFunction = (x , y ) -> x+y;
		
//		Float result = biFunction.apply(10 , 20.3f);
//		System.out.println(result);
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Float> floats= Arrays.asList(1.1f , 1.2f , 1.3f , 3.4f , 4.5f, 1.1f , 1.2f , 1.3f , 3.4f , 4.5f);
		List<Float> result = math(integers, floats, biFunction);
		System.out.println(result);
	}
	
	public static <X , Y , R> List<R> math(List<X> list1, List<Y> list2 , BiFunction<X, Y, R> biFunction ){
		List<R> output = new ArrayList<R>();
		for (int i = 0; i < list1.size(); i++) {
			R result = biFunction.apply(list1.get(i), list2.get(i));
			output.add(result);
		}
		return output;
	} 

}
