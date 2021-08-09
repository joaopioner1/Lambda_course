package first_example;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Laptop", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		 //funcao anonima - arrow function
		list.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));
		
		printList(list);
		
		list.removeIf(p -> p.getPrice() >= 1200);
		
		printList(list);

	}

	static void printList(List<Product> list) {
		System.out.println("---------------");
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
