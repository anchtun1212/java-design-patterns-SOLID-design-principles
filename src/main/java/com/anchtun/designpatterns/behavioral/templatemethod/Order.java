package com.anchtun.designpatterns.behavioral.templatemethod;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Order {

	private String id;
	private LocalDate date = LocalDate.now();
	private Map<String, Double> items = new HashMap<>();
	private double total;

	public Order(String id) {
		this.id = id;
		date = LocalDate.now();
	}

	public void addItem(String name, double price) {
		items.put(name, price);
		total += price;
	}
}
