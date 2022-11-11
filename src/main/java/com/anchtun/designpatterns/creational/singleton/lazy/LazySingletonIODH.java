package com.anchtun.designpatterns.creational.singleton.lazy;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that,
 * we have a lazy initialization without worrying about synchronization.
 */
public class LazySingletonIODH {

	private LazySingletonIODH() {
		System.out.println("Create LazySingletonIODH instance");
	}

	private static class LazySingletonHolder {
		static LazySingletonIODH INSTANCE = new LazySingletonIODH();
	}

	public static LazySingletonIODH getInstance() {
		return LazySingletonHolder.INSTANCE;
	}
}
