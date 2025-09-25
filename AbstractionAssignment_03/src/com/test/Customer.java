package com.test;

public class Customer extends Shop{
	
	private static int candyCount, cookieCount, iceCreamCount;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		candyCount = 0;
		cookieCount = 0;
		iceCreamCount = 0;
	}
	
	public void buyCandy(int qty)
	{
		if(qty <= candy.getQuantity())
		{
			candyCount += qty;
			candy.setQuantity(candy.getQuantity() - qty);
			
		}
		else
			System.out.println("Not enough candies in storage!");
		
	}
	
	public void buyCookies(int qty)
	{
		if(qty <= cookie.getQuantity())
		{
			cookieCount += qty;
			cookie.setQuantity(cookie.getQuantity() - qty);
		}
		else
			System.out.println("Not enough cookies in storage!");
	}
	
	public void buyIceCream(int qty)
	{
		if(qty <= iceCream.getQuantity())
		{
			iceCreamCount += qty;
			iceCream.setQuantity(iceCream.getQuantity() - qty);
		}
		else
			System.out.println("Not enough iceCreams in storage!");
	}
	
	public void candyPrice()
	{
		System.out.println("Candy price: " + Candy.getPricePerUnit());
	}
	
	public void cookiePrice()
	{
		System.out.println("Cookie price: " + Cookie.getPricePerUnit());
	}
	
	public void iceCreamPrice()
	{
		System.out.println("IceCream price: " + IceCream.getPricePerUnit());
	}
	
	public void viewBoughtItems()
	{
		System.out.println("You Bought the following items in unit");
		System.out.println("Candies : " + candyCount);
		System.out.println("Cookies : " + cookieCount);
		System.out.println("IceCreams : " + iceCreamCount);
		
	}
	
	public void showTax()
	{
		System.out.println("Current Tax : " + Candy.getTax());
	}
	
	public void showBill()
	{
		System.out.println("**************BILL*************");
		System.out.println("Items     "+"Units     "+"PricePerUnit(in rupees)     "+"Total");
		System.out.println("1.Candy     "+candyCount+"             "+(Candy.getPricePerUnit()*60)+"                   "+candy.getCost(candyCount));
		System.out.println("2.Cookies   "+cookieCount+"             "+(cookie.getPricePerUnit()*70)+"                   "+cookie.getCost(cookieCount));
		System.out.println("3.IceCreams "+iceCreamCount+"             "+iceCream.getPricePerUnit()+"                   "+iceCream.getCost(iceCreamCount));
		System.out.println("Total cost(tax included): " + (candy.getCost(candyCount) + cookie.getCost(cookieCount) + iceCream.getCost(iceCreamCount)));

	}

}
