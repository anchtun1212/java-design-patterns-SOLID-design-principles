package com.anchtun.designpatterns.creational.singleton.eager;

// This class uses eager initialization of singleton instance.
public class EagerSingleton {

	// constructor should not be accessible globally
	private EagerSingleton() {
		System.out.println("Create EagerSingleton instance");
	}
	
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
