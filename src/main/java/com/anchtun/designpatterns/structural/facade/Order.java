package com.anchtun.designpatterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Order {
	private String id;
	private double total;
}
