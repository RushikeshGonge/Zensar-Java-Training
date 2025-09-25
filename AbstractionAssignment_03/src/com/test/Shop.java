package com.test;

public class Shop {
	
	Candy candy = null;
	Cookie cookie = null;
	IceCream iceCream = null;
	
	public Shop() {
		 candy = new Candy(10,0.7);
		 cookie = new Cookie(10,0.113);
		 iceCream = new IceCream(10,45.0);
	}
	
	public void addCandy(int qty)
	{
		candy.setQuantity(candy.getQuantity() + qty);
		System.out.println(qty + " candies added to stoage.");
		System.out.println("Total candies in storage : " + candy.getQuantity());
	}
	
	public void addCookie(int qty)
	{
		cookie.setQuantity(qty + cookie.getQuantity());
		System.out.println(qty + " cookies added to storage.");
		System.out.println("Total cookies in storage : " + cookie.getQuantity());
	}
	
	public void addIceCream(int qty)
	{
		iceCream.setQuantity(qty + iceCream.getQuantity());
		System.out.println(qty + " iceCreams added to storage.");
		System.out.println("Total IceCreams in storage : " + iceCream.getQuantity());
	}
	
	public void setCandyPrice(double price)
	{
		candy.setPricePerUnit(price);
		System.out.println("Candy price updated!!");
	}
	
	public void setCookiePrice(double price)
	{
		cookie.setPricePerUnit(price);
		System.out.println("Cookie price updated!!");
	}
	
	public void setIceCreamPrice(double price)
	{
		iceCream.setPricePerUnit(price);
		System.out.println("IceCream price updated!!");
	}
	
	public void viewStorage()
	{
		System.out.println("ITEM QUANTITIES IN STORAGE");
		System.out.println("Candy : " + candy.getQuantity());
		System.out.println("Cookie : " + cookie.getQuantity());
		System.out.println("IceCream : " + iceCream.getQuantity());
	}
	
	
}
