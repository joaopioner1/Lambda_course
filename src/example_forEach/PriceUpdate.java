package example_forEach;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 10 / 100);
	}
	
	
}
