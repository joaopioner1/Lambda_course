package example_forEach;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product>{

	static int percntg = 10;
	
	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * percntg / 100);
	}
	
	
}
