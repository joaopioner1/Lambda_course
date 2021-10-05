package functionalinterface;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		incrementByOne.apply(1);
		int increment = incrementByOne.apply(2);
		System.out.println(increment);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String numb = scan.next();
		Integer swt = switchStringToInt.apply(numb);
		System.out.println(swt);
		
		int number = scan.nextInt();
		Integer x = incrementAndSum.apply(number);
		System.out.println("\n" + x);
		
		double number2 = scan.nextInt();
		double number3 = scan.nextInt();
		double y = multiply.apply(number2, number3);
		System.out.println("Y = " + y);
	}
	
	static Function<String, Integer> switchStringToInt = word -> Integer.parseInt(word);  
	
	static Function<Integer, Integer> sum = sum -> sum + 50; 
	
	static Function<Integer, Integer> incrementByOne = 
	number -> number + 1;//iInput integer, output integer too
			
	static Function<Integer, Integer> incrementAndSum = incrementByOne.andThen(sum);
	
	//BiFucntion
	static BiFunction<Double, Double, Double> multiply = (num1, num2) -> num1 * num2;
	
			
	static int increment(int number) {
		return number + 1;
	}
}
