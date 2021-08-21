package example_forEach;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TABLET", 3, 1200.00));
		list.add(new Product("COMPUTER", 9, 1800.00));
		list.add(new Product("CELLPHONE", 7, 1200.00));
		list.add(new Product("PHONE", 4, 50.00));
		
		list.removeIf(p -> p.getPrice() <= 50.00);
		
		//list.forEach(new PriceUpdate());
		list.forEach(System.out::println);

	}

}
