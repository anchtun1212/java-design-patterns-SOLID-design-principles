package com.anchtun.designpatterns.behavioral.state.states;

// Concrete state
public class Cancelled implements OrderState {

	@Override
	public double handleCancellation() {
		throw new IllegalStateException("Cancelled order. Can't cancel anymore");
	}

}