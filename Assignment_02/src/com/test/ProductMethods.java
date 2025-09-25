package com.test;

public class ProductMethods {
	private static int productId;
	private Product[] products;
	private static int index;
	private int tempId;
	
	static {
		productId = 1000;
		index = 0;
		
	}
	public ProductMethods() {
		products = new Product[100];
		// TODO Auto-generated constructor stub
	}
	
	public void addProduct(String name, double price, String brand)
	{
		tempId = ++productId;
		Product newProduct = new Product(tempId,name,price,brand);
		products[index++] = newProduct;
		System.out.println(name + " successfully added!!");
		
	}
	
	public void displayAllProducts()
	{
		for(int i = 0;i < index;i++)
		{
			System.out.println(products[i].toString() + "\n");
		}
	}
	
	public void mostExpensiveProduct()
	{
		double value = Double.MIN_VALUE;
		Product newProduct = new Product();
		for(int i = 0;i < index;i++)
		{
			if(products[i].getPrice() > value) {
				value = products[i].getPrice();
				newProduct = products[i];
			}
		}
		System.out.println("Details of most expensive product are ==> " + newProduct.toString());
	}
	
	public void leastExpensiveProduct()
	{
		double value = Double.MAX_VALUE;
		Product newProduct = new Product();
		for(int i = 0; i < index;i++)
		{
			if(products[i].getPrice() < value) {
				value = products[i].getPrice();
				newProduct = products[i];
			}
		}
		System.out.println("Details of least expensive product are ==> " + newProduct.toString());
	}
	
	public void avgPrice()
	{
		double sum = 0.0;
		for(int i = 0;i < index;i++)
		{
			sum = sum + products[i].getPrice();
		}
		
		double avg = sum / (index + 1);
		System.out.println("Average price of all products ==> " + avg);
	}
	
	public void detailsByBrand(String productBrand)
	{
		for(int i = 0;i < index;i++)
		{
			if(products[i].getBrand().equals(productBrand))
			{
				System.out.println(products[i].toString() + "\n");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
