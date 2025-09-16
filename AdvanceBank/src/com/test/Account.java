package com.test;

public class Account {
	private long accNo;
	private String name;
	private double balance;
	private static double rate;
	private boolean status;
	
	static {
		
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(long accNo, String name, double balance)
	{
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public String toString()
	{
		return "Account No => " + accNo + "\nAccount Holder Name => " + name + "\nAccount Balance => " +balance + "\nRate of Interest => " + rate;
	}
	
	//getters
	
	public long getAccNo()
	{
		return accNo;
	}
	
	public String getAccHolderName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public boolean getStatus()
	{
		return status;
	}
	
	//setters
	
	public void setAccNo(long accNo)
	{
		this.accNo = accNo;
	}
	
	public void setAccHolderName(String name)
	{
		this.name = name;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setRate(double rate)
	{
		this.rate = rate;
	}
	
	public void setStatus(boolean status)
	{
		this.status = status;
	}
	

}

