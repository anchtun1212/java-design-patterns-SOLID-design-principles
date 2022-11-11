package com.anchtun.designpatterns.creational.singleton.client;

import com.anchtun.designpatterns.creational.singleton.eager.EagerSingleton;
import com.anchtun.designpatterns.creational.singleton.enumeration.SingletonEnum;
import com.anchtun.designpatterns.creational.singleton.lazy.LazySingletonIODH;
import com.anchtun.designpatterns.creational.singleton.lazy.LazySingletonWithDCL;

public class Client {

	public static void main(String[] args) {
		// EagerSingleton
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		System.out.println(eagerSingleton1 == eagerSingleton2);// check references: check if the references point on the same object
		// LazySingletonWithDCL
		LazySingletonWithDCL LazySingletonWithDCL1 = LazySingletonWithDCL.getInstance();
		LazySingletonWithDCL LazySingletonWithDCL2 = LazySingletonWithDCL.getInstance();
		System.out.println(LazySingletonWithDCL1 == LazySingletonWithDCL2);
		// LazySingletonIODH
		// see console will create only one instance
		LazySingletonIODH lazySingletonIODH1 = LazySingletonIODH.getInstance();
		LazySingletonIODH lazySingletonIODH2 = LazySingletonIODH.getInstance();
		LazySingletonIODH lazySingletonIODH3 = LazySingletonIODH.getInstance();
		LazySingletonIODH lazySingletonIODH4 = LazySingletonIODH.getInstance();
		// SingletonEnum
		SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
		SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
		System.out.println(singletonEnum1 == singletonEnum2);
	}

}
