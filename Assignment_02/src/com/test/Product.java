package com.test;

public class Product {
	private int productId;
	private String name;
	private double price;
	private String brand;
	
	static {
		
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String name, double price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
		setProductId(productId);
	}
	
	//getters
	
	public int getId()
	{
		return productId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	//setters
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String toString()
	{
		return "Product Id => " + productId + "\nProduct Name => " + name + "\nProduct price => " + price + "\nProduct brand => " + brand;
	}
	
	
	

}
