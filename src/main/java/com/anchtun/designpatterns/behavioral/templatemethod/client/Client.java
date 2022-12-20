package com.anchtun.designpatterns.behavioral.templatemethod.client;

import java.io.IOException;

import com.anchtun.designpatterns.behavioral.templatemethod.Order;
import com.anchtun.designpatterns.behavioral.templatemethod.OrderPrinter;
import com.anchtun.designpatterns.behavioral.templatemethod.TextPrinter;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("1001");

		order.addItem("Buger", 9.50);
		order.addItem("Sandwitch", 11.95);
		order.addItem("Pizza", 15.95);

		//OrderPrinter htmlPrinter = new HtmlPrinter();
		//htmlPrinter.printOrder(order);
		
		OrderPrinter txtPrinter = new TextPrinter();
		txtPrinter.printOrder(order);
	}
}
