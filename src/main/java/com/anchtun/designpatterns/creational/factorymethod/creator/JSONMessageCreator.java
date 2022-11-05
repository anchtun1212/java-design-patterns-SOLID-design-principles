package com.anchtun.designpatterns.creational.factorymethod.creator;

import com.anchtun.designpatterns.creational.factorymethod.model.JSONMessage;
import com.anchtun.designpatterns.creational.factorymethod.model.Message;

// Provides implementation for creating JSON messages
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
}
