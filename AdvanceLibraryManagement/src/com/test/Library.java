package com.test;

public class Library {
	private int libId;
	private String libName;
	private String libCity;
	private Book[] books;
	private static int index;
	private static int bookId;
	//private static boolean available;
	
	static {
		index = 0;
		bookId = 1000;
		//available = false;
	}
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	public Library(int libId, String libName, String libCity)
	{
		this.libId = libId;
		this.libName = libName;
		this.libCity = libCity;
		books = new Book[100];
	}
	
	public void addBook(String title, double price, String language, int pubYear, Author author)
	{
		Book newBook = new Book(++bookId, title, price, language, pubYear, author);
		books[index++] = newBook;
		//available = true;
		System.out.println("Book => " + title + " added successfully!!!");
	}
	
	public void deleteBook(String title)
	{
		for(int i = 0;i < index;i++)
		{
			if(books[i].getTitle().equals(title))
			{
				books[i].setStatus(false);
				System.out.println("Book deleted successfully!!!");
			}
		}
	}
	
	public void mostExpensiveBook()
	{
		double mostExpensive = Double.MIN_VALUE;
		Book mostExpensiveBook = null;
		for(int i = 0;i < index;i++)
		{
			if(books[i].getPrice() > mostExpensive) {
				mostExpensive = books[i].getPrice();
				mostExpensiveBook = books[i];
			}
		}
		System.out.println("Most expensive book in library => " + mostExpensiveBook.getTitle() + "\nPrice => " + mostExpensiveBook.getPrice());
	}
	
	public void leastExpensiveBook()
	{
		double leastExpensive = Double.MAX_VALUE;
		Book leastExpensiveBook = null;
		for(int i = 0;i < index;i++)
		{
			if(books[i].getPrice() < leastExpensive) {
				leastExpensive = books[i].getPrice();
				leastExpensiveBook = books[i];
			}
		}
		System.out.println("Least expensive book in library => " + leastExpensiveBook.getTitle() + "\nPrice => " + leastExpensiveBook.getPrice());
	}
	
	public void printOldestBook()
	{
		int oldest = Integer.MIN_VALUE;
		Book oldestBook = null;
		for(int i = 0;i < index;i++)
		{
			if(books[i].getPubYear() > oldest)
			{
				oldest = books[i].getPubYear();
				oldestBook = books[i];
				
			}
		}
		System.out.println("Oldest book in the library => " + oldestBook.getTitle() + "\nPublication Year => "+oldestBook.getPubYear());

	}
	
	public void printBooksByLang(String language)
	{
		for(int i = 0;i < index;i++)
		{
			if(books[i].getLanguage().equals(language))
			{
				System.out.println(books[i].toString());
			}
		}
	}
	
	public void printBooksByAuthor(String authorName)
	{
		for(int i = 0;i < index;i++)
		{
			if(books[i].getAuthor().getAuthorName().equals(authorName))
			{
				System.out.println(books[i].toString());
			}
		}
	}
	
	public void printAvailableBooks()
	{
		for(int i = 0;i < index;i++)
		{
			if(books[i].getStatus() == true)
			{
				System.out.println(books[i].toString());
			}
		}
	}
	
	public void printRemovedBooks()
	{
		for(int i = 0;i < index;i++)
		{
			if(books[i].getStatus() == false)
			{
				System.out.println(books[i].toString());
			}
		}
	}
	
	

}
