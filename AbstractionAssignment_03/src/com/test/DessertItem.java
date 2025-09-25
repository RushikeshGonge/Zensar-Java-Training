package com.test;

public abstract class DessertItem {
	protected  int quantity;
	protected static double tax;
	
	static {
		tax = 18.0;
	}
	
	public DessertItem() {
		// TODO Auto-generated constructor stub
	}
	
	public DessertItem(int quantity)
	{
		this.quantity += quantity;
	}
	
	public abstract double getCost(int quantity);
	
	
	public  void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void setTax(double tax) {
		DessertItem.tax = tax;
	}

	public  int getQuantity()
	{
		return quantity;
	}
	
	public void reduceQuantity(int qty)
	{
		this.quantity -= qty;
	}
	
	public static double getTax()
	{
		return tax;
	}
	

}
