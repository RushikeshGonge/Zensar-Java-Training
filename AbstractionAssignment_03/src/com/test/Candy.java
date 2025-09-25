package com.test;

public class Candy extends DessertItem{
	private static double pricePerUnit;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	
	public Candy(int quantity, double pricePerUnit)
	{
		super(quantity);
		Candy.pricePerUnit = pricePerUnit;
	}
	

	
	@Override
	public double getCost(int quantity) {
		
		double cost = quantity * pricePerUnit * 60; //converting to rupees
		return cost + (cost * (super.getTax()/100));
	}

	public static double getPricePerUnit() {
		return pricePerUnit;
	}

	public static void setPricePerUnit(double pricePerUnit) {
		Candy.pricePerUnit = pricePerUnit;
	}
	
	

}
