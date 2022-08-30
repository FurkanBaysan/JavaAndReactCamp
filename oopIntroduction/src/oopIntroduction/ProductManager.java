package oopIntroduction;

public class ProductManager {

	public void addToCart(Product product) {
		System.out.println("Sepete Eklendi: " +
		// product.brand + " " +
				product.getBrand() + 
				product.model + " ");
	}

}
