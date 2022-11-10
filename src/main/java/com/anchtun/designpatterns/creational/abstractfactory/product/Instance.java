package com.anchtun.designpatterns.creational.abstractfactory.product;

// Represents an abstract product
public interface Instance {

	enum Capacity {
		MICRO, SMALL, LARGE
	}

	void start();

	void attachStorage(Storage storage);

	void stop();
}