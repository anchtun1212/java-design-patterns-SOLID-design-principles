package com.anchtun.solid.singleresponsibility.correct;

import java.io.IOException;

import com.anchtun.constant.Constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	// A valid USER JSON String
	private static final String VALID_USER_JSON = "{\"name\": \"Mohamed\", \"email\": \"mohamed@email.com\", \"address\":\"Monastir\"}";

	// Invalid USER JSON String - email format wrong
	private static final String INVALID_USER_JSON = "{\"name\": \"Aymen\", \"email\": \"aymen@gmail\", \"address\":\"Riyadh\"}";

	public static void main(String[] args) throws IOException {
		UserControllerCorrect controller = new UserControllerCorrect();
		// Check with valid JSON
		String response = controller.createUser(VALID_USER_JSON);
		if (!response.equalsIgnoreCase(Constants.SUCCESS)) {
			System.err.println(Constants.FAILED);
			log.error(response);
		}
		System.out.println("Valid JSON received response: " + response);
		// Check with invalid JSON
		response = controller.createUser(INVALID_USER_JSON);
		if (!response.equalsIgnoreCase(Constants.ERROR)) {
			System.err.println(Constants.FAILED);
		}
		System.out.println("Invalid JSON received response: " + response);
	}
}
