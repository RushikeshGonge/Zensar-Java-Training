package com.test1;

public class FilePersistence extends Persistence{
	@Override
	public void persist() {

		System.out.println("Data persisted in file.");
	}

}
