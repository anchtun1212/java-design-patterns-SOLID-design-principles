package com.anchtun.designpatterns.behavioral.state.client;

import com.anchtun.designpatterns.behavioral.state.Order;

public class Client {

	public static void main(String[] args) {
		Order order = new Order();

		order.paymentSuccessful();
		order.dispatched();

		order.cancel();
	}
}