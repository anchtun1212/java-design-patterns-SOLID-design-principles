package com.anchtun.designpatterns.creational.singleton.lazy;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazySingletonWithDCL {

	private LazySingletonWithDCL() {
		System.out.println("Create LazySingletonWithDCL instance");
	}

	//When multiple threads are referring to a variable, then it is quite common that these threads 
	//will cache value of this variable in one of the registered CPU registers.
	//To overcome that, Java has provided us with a keyword called volatile.
	//So as soon as we declare our instance variable as volatile, it will indicate to these threats that
	//they should not use the cached version of this variables value.
	//So every time they want to access the instance value, they will refer to the main memory and that we
	//can ensure or we can guarantee that both of these threats that are coming to our synchronize block will
	//get the latest value that is present.
	private static volatile LazySingletonWithDCL INSTANCE;

	public static LazySingletonWithDCL getInstance() {
		// Double Checked Locking
		if (INSTANCE == null) {
			//Now, as soon as we hit a synchronize block, one of the thread is going to get the lock which is associated
			//with this block and start executing the code inside it.
			//The second really is going to wait on this line.
			//So instead of checking once again, if we simply said that instance is equal to new lazy register,
			//with this instance, we are again going to run into same problems that both of these threats are going
			//to create two separate objects.
			//Because if you remember to thread scheme to the synchronized block because instance was not one of them
			//went ahead and created the instance second was reading on this particular line.
			//So as soon as the first thread leaves our synchronized block it can it will go inside and again execute
			//the same line.
			//And that's why it will create another instance and assign it back to our static variable.
			//To avoid that, we are going to do the null check for our instance variable once again in our static block
			synchronized (LazySingletonWithDCL.class) {
				// Double Checked Locking
				if (INSTANCE == null) {
					INSTANCE = new LazySingletonWithDCL();
				}
			}
		}
		return INSTANCE;
	}
}
