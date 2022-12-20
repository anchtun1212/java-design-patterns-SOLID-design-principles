package com.anchtun.designpatterns.behavioral.templatemethod;

import java.io.IOException;
import java.io.PrintWriter;

// Abstract base class defines the template method
public abstract class OrderPrinter {

	public final void printOrder(Order order) throws IOException {
		try (PrintWriter writer = new PrintWriter(System.out)) {
			writer.println(start());

			writer.println(formatOrderNumber(order));

			writer.println(formatItems(order));

			writer.println(formatTotal(order));

			writer.println(end());
		}
	}

	protected abstract String start();

	protected abstract String formatOrderNumber(Order order);

	protected abstract String formatItems(Order order);

	protected abstract String formatTotal(Order order);

	protected abstract String end();
}
