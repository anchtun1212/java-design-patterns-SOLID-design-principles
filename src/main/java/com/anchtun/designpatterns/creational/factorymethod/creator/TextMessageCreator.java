package com.anchtun.designpatterns.creational.factorymethod.creator;

import com.anchtun.designpatterns.creational.factorymethod.model.Message;
import com.anchtun.designpatterns.creational.factorymethod.model.TextMessage;

// Provides implementation for creating Text messages
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
