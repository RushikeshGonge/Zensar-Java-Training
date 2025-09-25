package com.test;

public class IceCream extends DessertItem{
	private static double pricePerUnit;
	
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	
	public IceCream(int quantity, double pricePerUnit)
	{
		super(quantity);
		IceCream.pricePerUnit = pricePerUnit;
	}
	
	public static double getPricePerUnit() {
		return pricePerUnit;
	}

	public static void setPricePerUnit(double pricePerUnit) {
		IceCream.pricePerUnit = pricePerUnit;
	}

	@Override
	public double getCost(int quantity) {
		double cost = quantity * pricePerUnit;
		return cost + ((super.getTax() / 100) * cost);
	}
}
