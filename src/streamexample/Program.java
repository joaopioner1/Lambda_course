package streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(3,5,4,8);
		
		Stream<Integer> str1 = list1.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(str1.toArray()));
		
		Stream<String> str2 = Stream.of("Joao", "Alex", "Isa");
		System.out.println(Arrays.toString(str2.toArray()));

		Stream<Integer> str3 = Stream.iterate(0, x -> x+2);
		System.out.println(Arrays.toString(str3.toArray()));

	}

}
