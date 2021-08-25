package util_function;

import java.util.function.Function;

import entities_function.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
	
	
}
