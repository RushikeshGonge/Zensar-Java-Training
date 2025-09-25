package com.test;

public class IceCream extends DessertItem{
	private double pricePerUnit;
	
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	
	public IceCream(int quantity, double pricePerUnit)
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
		double cost = quantity * pricePerUnit;
		return cost + ((super.getTax() / 100) * cost);
	}
}
