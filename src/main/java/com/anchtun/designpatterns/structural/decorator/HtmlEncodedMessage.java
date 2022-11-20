package com.anchtun.designpatterns.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

import lombok.AllArgsConstructor;

// Decorator. Implements component interface
@AllArgsConstructor
public class HtmlEncodedMessage implements Message {

	private Message msg;
	
	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}
}