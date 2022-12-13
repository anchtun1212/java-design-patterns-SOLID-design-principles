package com.anchtun.designpatterns.behavioral.strategy.client;

import java.util.LinkedList;

import com.anchtun.designpatterns.behavioral.strategy.PrintService;
import com.anchtun.designpatterns.behavioral.strategy.model.Order;
import com.anchtun.designpatterns.behavioral.strategy.stategies.DetailPrinter;

public class Client {

	private static LinkedList<Order> orders = new LinkedList<>();

	public static void main(String[] args) {
		createOrders();
		// print all orders
		// algorithm 1
		PrintService service = new PrintService(new DetailPrinter());
		// algorithm 2
		//PrintService service = new PrintService(new SummaryPrinter());
		
		service.printOrders(orders);

	}

	private static void createOrders() {
		Order o = new Order("100");
		o.addItem("Sandwich", 2);
		o.addItem("Chips", 10);
		orders.add(o);

		o = new Order("200");
		o.addItem("Cake", 20);
		o.addItem("Cookies", 5);
		orders.add(o);

		o = new Order("300");
		o.addItem("Burger", 8);
		o.addItem("Fries", 5);
		orders.add(o);
	}
}