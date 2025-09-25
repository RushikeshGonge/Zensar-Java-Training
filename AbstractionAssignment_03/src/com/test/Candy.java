package com.test;

public class Candy extends DessertItem{
	private double pricePerUnit;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	
	public Candy(int quantity, double pricePerUnit)
	{
		super(quantity);
		this.pricePerUnit = pricePerUnit;
	}
	

	
	@Override
	public double getCost(int quantity) {
		
		double cost = quantity * pricePerUnit * 60; //converting to rupees
		return cost + (cost * (super.getTax()/100));
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	

}
