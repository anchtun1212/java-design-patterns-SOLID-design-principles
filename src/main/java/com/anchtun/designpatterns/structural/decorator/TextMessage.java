package com.anchtun.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;

// Concrete component. Object to be decorated
@AllArgsConstructor
public class TextMessage implements Message {

	private String msg;

	@Override
	public String getContent() {
		return msg;
	}
}