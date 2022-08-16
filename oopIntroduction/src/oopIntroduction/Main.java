package oopIntroduction;

public class Main {

	public static void main(String[] args) {

		// object Need

//		String[] products = new String[] { 
//				"Lenovo V14", 
//				"Lenovo V15", 
//				"Huawei Matebook D15", 
//				"Huawei Matebook X Pro" };

		// improper use

		System.out.println("\t" + "Class, object, attribute and behaivor");

		Product firstProduct = new Product();
		firstProduct.id = 1;
		firstProduct.brand = "Huawei";
		firstProduct.model = "Matebook X Pro";
		firstProduct.unitPrice = 30000;

		Product secondProduct = new Product();
		secondProduct.id = 2;
		secondProduct.brand = "Lenovo";
		secondProduct.model = "Legion";
		secondProduct.unitPrice = 35000;

		Product thirdProduct = new Product();
		thirdProduct.id = 3;
		thirdProduct.brand = "Huawei";
		thirdProduct.model = "D15";
		thirdProduct.unitPrice = 20000;

		Category firstCategory = new Category();
		firstCategory.id = 1;
		firstCategory.name = "Elektronik";

		Category secondCategory = new Category();
		secondCategory.id = 2;
		secondCategory.name = "Moda";

		Product[] products = { firstProduct, secondProduct, thirdProduct };

		System.out.println("\t" + "- Product List -");

		for (Product product : products) {
			System.out.print(product.id + " " + product.brand + " " + product.model + " " + product.unitPrice + "\n");
		}

		System.out.println("Number of Products: " + products.length);

		System.out.println("\t" + "Constructors");

		Product fourthProduct = new Product(4, "Huawei", "D16", 25000);

		System.out.println(fourthProduct.id + " " + fourthProduct.brand + " " + fourthProduct.model + " "
				+ fourthProduct.unitPrice);

		System.out.println("\t" + "Methods");

		ProductManager productManager = new ProductManager();
		productManager.addToCart(firstProduct);
		productManager.addToCart(secondProduct);
		productManager.addToCart(thirdProduct);

	}

}
