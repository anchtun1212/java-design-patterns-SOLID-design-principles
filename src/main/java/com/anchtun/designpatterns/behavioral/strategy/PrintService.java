package com.anchtun.designpatterns.behavioral.strategy;

import java.util.LinkedList;

import com.anchtun.designpatterns.behavioral.strategy.model.Order;
import com.anchtun.designpatterns.behavioral.strategy.stategies.OrderPrinter;

import lombok.AllArgsConstructor;

// Context 
@AllArgsConstructor
public class PrintService {

	private OrderPrinter printer;

	public void printOrders(LinkedList<Order> orders) {
		printer.print(orders);
	}
}