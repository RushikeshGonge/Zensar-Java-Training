package com.test;

public class Cookie extends DessertItem{
	private double pricePerUnit; //in euros
	
	public Cookie() {
		// TODO Auto-generated constructor stub
	}
	
	public Cookie(int quantity, double pricePerUnit)
	{
		super(quantity);
		this.pricePerUnit = pricePerUnit;
	}
	
	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	@Override
	public double getCost(int quantity) {
		double cost = quantity * pricePerUnit * 70; //converting euros in rupees
		return cost + ((super.getTax() / 100) * cost);
	}

}
