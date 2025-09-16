package com.test;

public class Book {
	private int bookId;
	private String title;
	private double price;
	private String language;
	private int pubYear;
	private Author author;
	private static boolean available;
	private static int authorId;
	
	static {
		available = false;
		authorId = 10000;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookId, String title, double price, String language, int pubYear, Author author)
	{
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.language = language;
		this.pubYear = pubYear;
		this.author = author;
		this.available = true;
	}	
	//getters
	
	public int getBookId()
	{
		return bookId;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getLanguage()
	{
		return language;
	}
	
	public int getPubYear()
	{
		return pubYear;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public boolean getStatus()
	{
		return available;
	}
	
	//setters
	
	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
	public void setPubYear(int pubYear)
	{
		this.pubYear = pubYear;
	}
	
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
	public void setStatus(boolean available)
	{
		this.available = available;
	}
	
	
	
	public String toString()
	{
		return 	"-----------------------------------------------------------------------\n"+
				"Book Id => " + bookId + "\nTitle => " + title + "\nPrice => " + price + "\nLanguage => " + language + "\nPublication Year => " + pubYear + "\nAuthor Details ==> " + author.toString() +
				"\n------------------------------------------------------------------------\n";
	}

}
