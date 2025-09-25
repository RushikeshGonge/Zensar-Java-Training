package com.test;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		ProductMethods meth = new ProductMethods();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("****************Welcome to Product Management App*******************");
		do {
			System.out.println("1. Add a product");
			System.out.println("2. Display all products");
			System.out.println("3. Display details of most expensive product");
			System.out.println("4. Display details of least expensive product");
			System.out.println("5. Print average price of all products");
			System.out.println("6. Print all products of given brand");
			System.out.println("7. Stop");
			System.out.print("Enter the choice");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter name of a product");
				String productName = sc.next();
				System.out.println("Enter brand of a product");
				String productBrand = sc.next();
				System.out.println("Enter the price of a product");
				Double productPrice = sc.nextDouble();
				meth.addProduct(productName, productPrice, productBrand);
				break;
			case 2:
				meth.displayAllProducts();
				break;
			case 3:
				meth.mostExpensiveProduct();
				break;
			case 4:
				meth.leastExpensiveProduct();
				break;
			case 5:
				meth.avgPrice();
				break;
			case 6:
				System.out.println("Enter brand");
				productBrand = sc.next();
				meth.detailsByBrand(productBrand);
				break;
			default: System.out.println("Thankyou!!!");
				break;
			}			
		}while(choice != 7);
	}
}
