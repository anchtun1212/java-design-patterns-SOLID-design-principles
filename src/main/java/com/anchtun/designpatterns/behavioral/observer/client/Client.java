package com.anchtun.designpatterns.behavioral.observer.client;

import com.anchtun.designpatterns.behavioral.observer.Order;
import com.anchtun.designpatterns.behavioral.observer.PriceObserver;
import com.anchtun.designpatterns.behavioral.observer.QuantityObserver;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("105");
		PriceObserver price = new PriceObserver();
		order.attach(price);

		QuantityObserver quant = new QuantityObserver();
		order.attach(quant);

		order.addItem(50);
		order.addItem(179);

		System.out.println(order);
	}
}