package com.anchtun.designpatterns.structural.flyweight;

import lombok.AllArgsConstructor;

// A concrete Flyweight. Instance is shared
@AllArgsConstructor
public class SystemErrorMessage implements ErrorMessage {

	// some error message $errorCode
	private String messageTemplate;

	// http://somedomain.com/help?error=
	private String helpUrlBase;

	@Override
	public String getText(String code) {
		return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
	}

}