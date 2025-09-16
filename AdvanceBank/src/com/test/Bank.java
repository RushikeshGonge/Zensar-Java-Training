package com.test;

import java.time.LocalDateTime;

public class Bank {
	private int bankId;
	private String name;
	private String city;
	private Account[] accounts;
	private static double totalBalance,rate;
	private static int totalAccounts,index;
	
	static {
		totalBalance = 0.0;
		totalAccounts = 0;
		index = 0;
		rate = 8.5;
	}
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public Bank(int bankId, String name, String city) {
		this.bankId = bankId;
		this.name = name;
		this.city =city;
		this.accounts = new Account[100];
	}
	
	public Account openAccount(String name, double balance)
	{
		long accNo = index + 10001;
		Account newAcc = new Account(accNo, name, balance);
		newAcc.setRate(rate);
		accounts[index++] = newAcc;
		totalAccounts++;
		newAcc.setStatus(true);
		totalBalance += balance;
		return newAcc;
	}
	
	public void printTotalBalance()
	{
		System.out.println("Total balance on "+LocalDateTime.now()+" is "+totalBalance);
	}
	
	public void printTotalAccounts()
	{
		System.out.println("Total no. of accounts on "+LocalDateTime.now()+" is "+totalAccounts);
	}
	
	public void printRate()
	{
		System.out.println("Rate of interest on "+LocalDateTime.now()+" is "+rate);
	}
	
	public void deposit(long accNo, double amount)
	{
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getAccNo() == accNo)
			{
				accounts[i].setBalance(accounts[i].getBalance() + amount);
				totalBalance += amount;
				System.out.println("Amount deposited successfully!!");
				System.out.println("Updated account balance for account no "+accounts[i].getAccNo() + " => " + accounts[i].getBalance());
			}
		}
		
	}
	
	public void withdraw(long accNo, double amount)
	{
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getAccNo() == accNo)
			{
				accounts[i].setBalance(accounts[i].getBalance() - amount);
				totalBalance -= amount;
				System.out.println("Amount withdrawn successfully!!");
				System.out.println("Updated account balance for account no "+accounts[i].getAccNo() + " => " + accounts[i].getBalance());
			}
		}
		
	}
	
	public boolean closeAccount(long accNo)
	{
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getAccNo() == accNo) {
				accounts[i].setStatus(false);
				totalBalance -= accounts[i].getBalance();
				totalAccounts--;
				accounts[i].setBalance(0);
				return true;				
			}
		}
		return false;
	}
	
	public void reactivateAccount(long accNo, double balance)
	{
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getAccNo() == accNo)
			{
				if(accounts[i].getStatus() != true)
				accounts[i].setStatus(true);
				accounts[i].setBalance(balance);
				totalBalance += accounts[i].getBalance();
				totalAccounts++;
				System.out.println("Account with account no "+accounts[i].getAccNo()+" is reactivated with balance "+accounts[i].getBalance());
			}
		}
	}
	
	public void printAllActiveAccountDetails()
	{
		System.out.println("####################ALL ACCOUNT DETAILS#####################");
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getStatus() == true)
			{
				System.out.println("-------------------------------");
				System.out.println(accounts[i]);
				System.out.println("-------------------------------");
			}
		}
	}
	
	public void printAllInactiveAccountDetails()
	{
		System.out.println("####################ALL INACTIVE ACCOUNT DETAILS#####################");
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getStatus() == false)
			{
				System.out.println("-------------------------------");
				System.out.println(accounts[i]);
				System.out.println("-------------------------------");
			}
		}
	}

	public void transfer(long srcAcc, long destAcc, double transferAmount) {

		boolean srcFlag = false;
		boolean destFlag = false;
		Account srcAccount, destAccount;
		srcAccount = destAccount = null;
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getAccNo() == srcAcc) {
				if(accounts[i].getBalance() >= transferAmount) 	{
					srcFlag = true;
				}
				else {
					System.out.println("Source account has insufficient balance to tranfer!!!");
					System.out.println("Available balance => " + accounts[i].getBalance());
				}
				srcAccount = accounts[i];
			}
			
		}
		if(srcFlag == false)
		{
			System.out.println("Sender's bank account does not exist");
			return;
		}
		
		for(int i = 0;i < index;i++)
		{
			if(accounts[i].getAccNo() == destAcc)
			{
				if(accounts[i].getStatus() == true) {
					destFlag = true;
				}
				else {
					System.out.println("Account no "+accounts[i].getAccNo()+" exist but it is inactive!!!");
				}
				destAccount = accounts[i];
			}
		}
		if(destFlag == false)
		{
			System.out.println("Receiver's bank account does not exist.");
		}
		
		if(srcFlag && destFlag)
		{
			srcAccount.setBalance(srcAccount.getBalance() - transferAmount);
			destAccount.setBalance(destAccount.getBalance() + transferAmount);
			System.out.println("Amount transferred successfully!!!");
			System.out.println("Updated balance => ");
			System.out.println("Sender's balance => " + srcAccount.getBalance());
			System.out.println("Receiver's balance => " + destAccount.getBalance());
		}
	}
}