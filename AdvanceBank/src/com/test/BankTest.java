package com.test;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank SBI = new Bank(101, "SBI", "Pune");
		int choice = 0;
		do {
			System.out.println("**********MENU**********");
			System.out.println("1. Open Account");
			System.out.println("2. Total Balance In Bank");
			System.out.println("3. Total Accounts In Bank");
			System.out.println("4. Print Details Of All Active Accounts");
			System.out.println("5. Check Rate Of Interest");
			System.out.println("6. Close Account");
			System.out.println("7. Deposit");
			System.out.println("8. Withdraw");
			System.out.println("9. Print Details Of All Inactive Accounts");
			System.out.println("10. Reactivate an inactive account");
			System.out.println("11. Transfer Amount");
			System.out.println("12. Stop");
			System.out.print("\nEnter a choice:");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter name to open account");
				String name = sc.next();
				System.out.println("Enter initial balance");
				double balance = sc.nextDouble();
				Account acc = SBI.openAccount(name, balance);
				if(acc != null) {
					System.out.println("Account opened successfully!!");
					System.out.println("Account Details are as follows...");
					System.out.println(acc);
				}
				else System.out.println("Failed to open account...");
				break;
			case 2:
				SBI.printTotalBalance();
				break;
			case 3:
				SBI.printTotalAccounts();
				break;
			case 4:
				SBI.printAllActiveAccountDetails();
				break;
			case 5:
				SBI.printRate();
				break;
			case 6:
				System.out.println("Enter account number which you want to close");
				long accNo = sc.nextLong();
				boolean flag = SBI.closeAccount(accNo);
				if(flag)
					System.out.println("Account no "+accNo+" is closed..");
				else System.out.println("Account does not exist with account no " + accNo);
				break;
			case 7:
				System.out.println("Enter account number in which you want to deposit");
				long account = sc.nextLong();
				System.out.println("Enter amount to deposit");
				double amount = sc.nextDouble();
				SBI.deposit(account, amount);
				break;
			case 8:
				System.out.println("Enter account number from which you want to withdraw");
				long accountNo = sc.nextLong();
				System.out.println("Enter amount to withdraw");
				double amountToWithdraw = sc.nextDouble();
				SBI.withdraw(accountNo, amountToWithdraw);
				break;
			case 9:
				SBI.printAllInactiveAccountDetails();
				break;
			case 10:
				System.out.println("Enter account no to reactivte");
				long reactivateAccNo = sc.nextLong();
				System.out.println("Enter initial amount to deposit");
				double initialAmount = sc.nextDouble();
				SBI.reactivateAccount(reactivateAccNo, initialAmount);
				break;
			case 11:
				System.out.println("Enter account no to tranfer amount from");
				long srcAcc = sc.nextLong();
				System.out.println("Enter account no to transfer amount to");
				long destAcc = sc.nextLong();
				System.err.println("Enter amount to tranfer");
				double transferAmount = sc.nextDouble();
				SBI.transfer(srcAcc,destAcc,transferAmount);
				break;
			default: System.out.println("Thankyou for banking with us!!!");
			break;
			}			
		}while(choice != 12);
	}
	
}
