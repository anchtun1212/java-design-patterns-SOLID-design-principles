package com.anchtun.designpatterns.creational.factorymethod.creator;

import com.anchtun.designpatterns.creational.factorymethod.model.Message;

// This is our abstract "creator". 
// The abstract method createMessage() has to be implemented by its subclasses.
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
	//Factory method
	protected abstract Message createMessage();
}