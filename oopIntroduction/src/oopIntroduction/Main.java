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
		// firstProduct.id = 1;
		firstProduct.setId(1);
		// firstProduct.brand = "Huawei";
		firstProduct.setBrand("Huawei");
		firstProduct.model = "Matebook X Pro";
		// firstProduct.unitPrice = 30000;
		firstProduct.setUnitPrice(30000);
		// firstProduct.discountRate = 10;
		firstProduct.setDiscountRate(10);
		// firstProduct.unitPriceAfterDiscount = 27000;
		System.out.println(firstProduct.getUnitPriceAfterDiscount());

		Product secondProduct = new Product();
		// secondProduct.id = 2;
		secondProduct.setId(2);
		// secondProduct.brand = "Lenovo";
		secondProduct.setBrand("Lenovo");
		secondProduct.model = "Legion";
		// secondProduct.unitPrice = 35000;
		secondProduct.setUnitPrice(35000);

		Product thirdProduct = new Product();
		// thirdProduct.id = 3;
		thirdProduct.setId(3);
		// thirdProduct.brand = "Huawei";
		thirdProduct.setBrand("Huawei");
		thirdProduct.model = "D15";
		// thirdProduct.unitPrice = 20000;
		thirdProduct.setUnitPrice(20000);

		Product[] products = { firstProduct, secondProduct, thirdProduct };

		System.out.println("\t" + "- Product List -");

		for (Product product : products) {
			System.out.print(// product.id
					product.getId() + " " + // product.brand +
							product.getBrand() + " " + product.model + " " +
							// product.unitPrice
							product.getUnitPrice() + "\n");
		}

		System.out.println("Number of Products: " + products.length);

		System.out.println("\t" + "Constructors");

		Product fourthProduct = new Product(4, "Huawei", "D16", 25000, 10);

		System.out.println(// fourthProduct.id +
				fourthProduct.getId() + " " +
				// fourthProduct.brand +
						fourthProduct.getBrand() + " " + fourthProduct.model + " " +
						// fourthProduct.unitPrice
						fourthProduct.getUnitPrice());

		System.out.println("\t" + "Methods");

		ProductManager productManager = new ProductManager();
		productManager.addToCart(firstProduct);
		productManager.addToCart(secondProduct);
		productManager.addToCart(thirdProduct);

		System.out.println("\t" + "Encapsulation");

		Product fifthProduct = new Product();
		// fifthProduct.id = 5; => Compile-Time Error
		fifthProduct.setId(5);
		// fifthProduct.brand = "Lenovo"; => Compile-Time Error
		fifthProduct.setBrand("Huawei");
		// fifthProduct.unitPrice=50000;
		fifthProduct.setUnitPrice(50000);
		// fifthProduct.discountRate=10;
		fifthProduct.setDiscountRate(10);
		System.out.println(fifthProduct.getCode());
		System.out.println(fifthProduct.getUnitPriceAfterDiscount());

		Category firstCategory = new Category();
		firstCategory.setId(1);
		firstCategory.setName("Elektronik");

		Category secondCategory = new Category(2, "Moda");
		// secondCategory.setId(2);
		// secondCategory.setName("Moda");

		System.out.println(firstCategory.getName());
		System.out.println(secondCategory.getName());

	}

}
