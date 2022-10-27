package com.anchtun.solid.singleresponsibility.wrong;

import java.io.IOException;

public class Main {
	// A valid USER JSON String
	private static final String VALID_USER_JSON = "{\"name\": \"Mohamed\", \"email\": \"mohamed@email.com\", \"address\":\"Monastir\"}";

	// Invalid USER JSON String - email format wrong
	private static final String INVALID_USER_JSON = "{\"name\": \"Aymen\", \"email\": \"aymen@email\", \"address\":\"Riyadh\"}";

	public static void main(String[] args) throws IOException {
		UserControllerWrong controller = new UserControllerWrong();
		// Check with valid JSON
		String response = controller.createUser(VALID_USER_JSON);
		if (!response.equalsIgnoreCase("SUCCESS")) {
			System.err.println("Failed");
		}
		System.out.println("Valid JSON received response: " + response);
		// Check with invalid JSON
		response = controller.createUser(INVALID_USER_JSON);
		if (!response.equalsIgnoreCase("ERROR")) {
			System.err.println("Failed");
		}
		System.out.println("Invalid JSON received response: " + response);
	}
}
