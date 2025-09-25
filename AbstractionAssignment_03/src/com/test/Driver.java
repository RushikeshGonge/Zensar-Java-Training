package com.test;

import java.util.Scanner;

public class Driver {
	
	static Shop s = new Shop();
	static Customer c = new Customer();
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		

			System.out.println("*********WELOCME TO DESSERT SHOP*********");
			int role = 0;
			do {
				System.out.println("Enter your role(1. Owner/2. Customer/3. Exit): ");
				role = sc.nextInt();
				switch(role)
				{
				case 1:
					ownerMenu();
					break;
				case 2:
					customerMenu();
					break;
				case 3:
					System.out.println("Thankyou for using Dessert Shop Application!!!");
					return;
				default:
					System.out.println("Inavalid role");
					break;
				}
				
			}while(role != 3);
	}
			
			
			

	
	private static void ownerMenu()
	{
		while(true)
		{
			System.out.println("-----OWNER MENU-----");
			System.out.println("1. Add Candy");
			System.out.println("2. Add Cookie");
			System.out.println("3. Add IceCream");
			System.out.println("4. Set Candy Price");
			System.out.println("5. Set Cookie Price");
			System.out.println("6. Set Ice Cream Price");
			System.out.println("7. Set tax");
			System.out.println("8. View Storage");
			System.out.println("9. Back");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the quantity of candies: ");
				int qty = sc.nextInt();
				s.addCandy(qty);
				break;
			case 2:
				System.out.println("Enter the quatity of cookies: ");
				qty = sc.nextInt();
				s.addCookie(qty);
				break;
			case 3:
				System.out.println("Enter the quantity of ice creams: ");
				qty = sc.nextInt();
				s.addIceCream(qty);
				break;
			case 4:
				System.out.println("Enter new price per unit for candy: ");
				double price = sc.nextDouble();
				s.setCandyPrice(price);
				break;
			case 5:
				System.out.println("Enter new price per unit for cookie: ");
				price = sc.nextDouble();
				s.setCookiePrice(price);
				break;
			case 6:
				System.out.println("Enter new price per unit for ice cream: ");
				price = sc.nextDouble();
				s.setIceCreamPrice(price);
				break;
			case 7:
				System.out.println("Enter new tax");
				double newTax = sc.nextDouble();
				Shop.setTax(newTax);
				break;
			case 8:
				s.viewStorage();
				break;
			case 9:
				return;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
	
	private static void customerMenu()
	{
		while(true)
		{
			System.out.println("------CUSTOMER MENU-----");
			System.out.println("1. Buy Candy");
			System.out.println("2. Buy Cookie");
			System.out.println("3. Buy IceCream");
			System.out.println("4. View Candy Price");
			System.out.println("5. View Cookie Price");
			System.out.println("6. View IceCream Price");
			System.out.println("7. View Bought Items");
			System.out.println("8. Show Bill");
			System.out.println("9. Show tax");
			System.out.println("10. Back");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("How many candies you want to buy?");
				int qty = sc.nextInt();
				c.buyCandy(qty);
				break;
			case 2:
				System.out.println("How many cookies you want to buy?");
				qty = sc.nextInt();
				c.buyCookies(qty);
				break;
			case 3:
				System.out.println("How many iceCreams you want to buy?");
				qty = sc.nextInt();
				c.buyIceCream(qty);
				break;
			case 4:
				c.candyPrice();
				break;
			case 5:
				c.cookiePrice();
				break;
			case 6:
				c.iceCreamPrice();
				break;
			case 7:
				c.viewBoughtItems();
				break;
			case 8:
				c.showBill();
				break;
			case 9:
				c.showTax();
				break;
			case 10:
				return;
			default:
				System.out.println("Invalid Choice");
				break;			
			}
		}
		
	}

}
