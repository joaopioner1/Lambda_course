package entities_function;

import java.util.List;
import java.util.function.Predicate;

import first_example.Product;

public class ProductService {
	
	public static double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
