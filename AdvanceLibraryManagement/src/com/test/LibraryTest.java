package com.test;

import java.util.Scanner;

public class LibraryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library Zensar = new Library(101,"Zensar Library","Pune");
		int choice = 0;
		
		do {
			System.out.println("1. Add a book");
			System.out.println("2. Delete book by title");
			System.out.println("3. Display most expensive book");
			System.out.println("4. Display least expenive book");
			System.out.println("5. Display oldest book");
			System.out.println("6. Display all books by language");
			System.out.println("7. Display all books by author");
			System.out.println("8. Display all available books in library");
			System.out.println("9. Display all removed books from library");
			System.out.println("10. Stop");
			System.out.print("\nEnter a choice => ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("To add a book enter few details ==> ");
				System.out.println("Enter title of a book");
				String title = sc.next();
				System.out.println("Enter a price");
				double price = sc.nextDouble();
				System.out.println("Enter a language");
				String language = sc.next();
				System.out.println("Enter a publication year");
				int pubYear = sc.nextInt();
				System.out.println("Enter author details ==> ");
				System.out.println("Enter author name");
				String authorName = sc.next();
				System.out.println("Enter author city");
				String authorCity = sc.next();
				Author author = new Author(authorName,authorCity);
				Zensar.addBook(title, price, language, pubYear, author);
				break;
			case 2:
				System.out.println("Enter a name of a book to delete");
				title = sc.next();
				Zensar.deleteBook(title);
				break;
			case 3:
				Zensar.mostExpensiveBook();
				break;
			case 5:
				Zensar.printOldestBook();;
				break;
			case 6:
				System.out.println("Enter a language of which you want books");
				String bookLang = sc.next();
				Zensar.printBooksByLang(bookLang);
				break;
			case 4:
				Zensar.leastExpensiveBook();
				break;
			case 7:
				System.out.println("Enter author name whose books you want");
				String authName = sc.next();
				Zensar.printBooksByAuthor(authName);
				break;
			case 8:
				Zensar.printAvailableBooks();
				break;
			case 9:
				Zensar.printRemovedBooks();
				break;
			default: System.out.println("Thankyou !!!");
				break;			
			}
		}while(choice != 10);
	}
	

}
