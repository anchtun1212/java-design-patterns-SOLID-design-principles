package com.anchtun.designpatterns.structural.decorator;

import java.util.Base64;
import lombok.AllArgsConstructor;

//Decorator. Implements component interface
@AllArgsConstructor
public class Base64EncodedMessage implements Message {

	private Message msg;

	@Override
	public String getContent() {
		// Be wary of charset!! This is platform dependent..
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}

}