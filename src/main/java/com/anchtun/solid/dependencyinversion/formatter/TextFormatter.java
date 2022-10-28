package com.anchtun.solid.dependencyinversion.formatter;

import com.anchtun.solid.dependencyinversion.model.Message;

public class TextFormatter implements Formatter {

	public String format(Message message) {
		return message.getCurrentTime() + ":" + message.getMsg();
	}
}