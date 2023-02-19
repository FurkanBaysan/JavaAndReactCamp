package oopIntroduction;

import java.awt.Image;

public class Product {

	private long id;
	private String code;
	private String brand;
	public String name;
	public String model;
	private double unitPrice;
	public int stockAmount;
	public String description;
	public String image;
	private double discountRate;
	private double unitPriceAfterDiscount;
	public Category category;

	public Product() {
		// System.out.println("I Worked"); 
	}

	public Product(long id, String brand, String model, double unitPrice, double discountRate) {
		// this();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;

	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return this.brand.substring(0, 1) + this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getUnitPriceAfterDiscount() {
		this.unitPriceAfterDiscount = this.unitPrice - (this.unitPrice * this.discountRate / 100);

		return this.unitPriceAfterDiscount;
	}

}
