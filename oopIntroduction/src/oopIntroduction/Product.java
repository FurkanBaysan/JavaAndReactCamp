package oopIntroduction;

import java.awt.Image;

public class Product {

	public long id;
	public String name;
	public String brand;
	public String model;
	public double unitPrice;
	public int stockAmount;
	public double discountRate;
	public String description;
	public Image image;

	public Category category;

	public Product() {
		// System.out.println("I Worked");
	}

	public Product(long id, String brand, String model, double unitPrice) {
		// this();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.unitPrice = unitPrice;
	}

}
