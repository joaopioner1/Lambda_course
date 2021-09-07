package application_function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities_function.ProductService;
import first_example.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Laptop", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Headphone", 80.00));
		list.add(new Product("Kindle", 300.00));
		
		double sum = ProductService.filteredSum(list, p -> p.getName().charAt(0) == 'K');
		
		System.out.println(String.format("%.2f", sum));
		/*List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);*/
	}

}
