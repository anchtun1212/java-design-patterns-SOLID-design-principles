package com.anchtun.designpatterns.behavioral.state.states;

// Concrete state
public class Paid implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("Contacting payment gateway to rollback transaction");
		// cancellation fee
		return 10;
	}

}