package com.anchtun.solid.dependencyinversion.exception;

import java.io.IOException;

//Thrown by formatter
public class FormatException extends IOException {

	public FormatException(Exception cause) {
		super(cause);
	}
}