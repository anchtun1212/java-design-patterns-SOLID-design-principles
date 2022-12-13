package com.anchtun.designpatterns.behavioral.strategy.stategies;

import java.util.Collection;

import com.anchtun.designpatterns.behavioral.strategy.model.Order;

// Strategy
public interface OrderPrinter {

	void print(Collection<Order> orders);
}