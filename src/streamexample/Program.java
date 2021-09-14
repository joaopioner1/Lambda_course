package streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(3,5,4,8);
		
		Stream<Integer> str1 = list1.stream();
		
		System.out.println(Arrays.toString(str1.toArray()));
	}

}
