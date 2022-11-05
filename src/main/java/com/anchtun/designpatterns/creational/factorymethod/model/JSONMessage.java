package com.anchtun.designpatterns.creational.factorymethod.model;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"Salam\":[]}";
	}
}
