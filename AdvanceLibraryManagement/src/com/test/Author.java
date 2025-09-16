package com.test;

public class Author {
	private int authorId;
	private String authorName;
	private String authorCity;
	private static int tempAuthId;
	
	static {
		tempAuthId = 10000;
	}
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String authorName, String authorCity)
	{
		this.authorName = authorName;
		this.authorCity = authorCity;
		this.authorId = ++tempAuthId;
	}
	
	//getters
	
	public int getAuthorId()
	{
		return authorId;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
	
	public String getAuthorCity()
	{
		return authorCity;
	}
	
	//setters
	
	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}
	
	public void setAuthorName()
	{
		this.authorName = authorName;
	}
	
	public void setAuthorCity()
	{
		this.authorCity = authorCity;
	}
	
	public String toString()
	{
		return "AuthorId => " + authorId + "\nAuthor Name = >" + authorName + "\nAuthor City => " + authorCity;
	}
	

}
