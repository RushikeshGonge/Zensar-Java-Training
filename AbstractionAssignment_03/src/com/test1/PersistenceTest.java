package com.test1;

import java.util.Scanner;

public class PersistenceTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persistence persistence = null;
		
		System.out.println("Where do you want to save the data(file or database)?");
		String type = sc.nextLine().trim().toLowerCase();
		
		if(type.equals("file"))
			persistence = new FilePersistence();
		else if(type.equals("database"))
			persistence = new DatabasePersistence();
		else
			{
				System.out.println("Invalid input");
				sc.close();
				return;
			}
		persistence.persist();
		sc.close();
		
	}

}
