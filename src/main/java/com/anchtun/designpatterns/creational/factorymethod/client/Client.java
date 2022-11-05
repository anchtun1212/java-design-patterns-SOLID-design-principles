package com.anchtun.designpatterns.creational.factorymethod.client;

import com.anchtun.designpatterns.creational.factorymethod.creator.JSONMessageCreator;
import com.anchtun.designpatterns.creational.factorymethod.creator.MessageCreator;
import com.anchtun.designpatterns.creational.factorymethod.creator.TextMessageCreator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}

	public static void printMessage(MessageCreator creator) {
		Object content = creator.getMessage().getContent();
		log.info("\n" + content);
	}
}