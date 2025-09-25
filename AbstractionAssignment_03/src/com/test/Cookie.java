package com.test;

public class Cookie extends DessertItem{
	private static double pricePerUnit; //in euros
	
	public Cookie() {
		// TODO Auto-generated constructor stub
	}
	
	public Cookie(int quantity, double pricePerUnit)
	{
		super(quantity);
		Cookie.pricePerUnit = pricePerUnit;
	}
	
	public static double getPricePerUnit() {
		return pricePerUnit;
	}

	public static void setPricePerUnit(double pricePerUnit) {
		Cookie.pricePerUnit = pricePerUnit;
	}

	@Override
	public double getCost(int quantity) {
		double cost = quantity * pricePerUnit * 70; //converting euros in rupees
		return cost + ((super.getTax() / 100) * cost);
	}

}
