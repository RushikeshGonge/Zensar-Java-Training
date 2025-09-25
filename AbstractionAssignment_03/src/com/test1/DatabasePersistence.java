package com.test1;

public class DatabasePersistence extends Persistence{
	@Override
	public void persist() {

		System.out.println("Data persisted in database.");
	}

}
