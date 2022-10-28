package com.anchtun.solid.singleresponsibility.wrong;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.anchtun.solid.singleresponsibility.model.User;
import com.anchtun.solid.singleresponsibility.utility.Store;
import com.fasterxml.jackson.databind.ObjectMapper;

//What whenever you are trying to test whether an existing code or existing class satisfies the single
//responsibility principle, you have to ask yourself what this class is supposed to do and what exactly it is doing right now.
//A controller in an MVC application is supposed to:
//It will receive the request from the client and it will handle that request to rest of the application
//and it will get the results of that processing and will send the response to the client.
//A controller itself is not supposed to have any business logic in it.
//Our UserController here is doing multiple things.
//So it is getting the request and creating a user object from that request.
//It is validating that object and it is also taking care of storing that object in our HashMap.
//You can see how the single responsibility principle is getting violated, because now there are multiple
//reasons for this UserControler class to change.
//If validation logic changes or if we add a new field in every user, then UserController needs to change
//because it needs to modify all these validations.
//If the way we store our user object changes, let's see if we start using an actual database or if we
//start using something like NoSQL databases like Mongo DB, our UserController needs to change apart
//from these additional responsibilities, the original responsibility of this class, which is actually
//accepting the request, if that changes, then of course this class has to change.

//How to fix
//For example, the validation is something that controller should not bother about.
//It should not have the implementation of all of these validation because these are going to change.
//So need to add UserValidator class please see UserControllerCorrect

//Handles incoming JSON requests that work on User resource/entity
public class UserControllerWrong {
	// Store used by controller
	private Store store = new Store();

	// Create a new user
	public String createUser(String userJson) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		User user = mapper.readValue(userJson, User.class);

		if (!isValidUser(user)) {
			return "ERROR";
		}

		store.store(user);

		return "SUCCESS";
	}

	// Validates the user object
	private boolean isValidUser(User user) {
		if (!isPresent(user.getName())) {
			return false;
		}
		user.setName(user.getName().trim());

		if (!isValidAlphaNumeric(user.getName())) {
			return false;
		}
		if (user.getEmail() == null || user.getEmail().trim().length() == 0) {
			return false;
		}
		user.setEmail(user.getEmail().trim());
		if (!isValidEmail(user.getEmail())) {
			return false;
		}
		return true;
	}

	// Simply checks if value is null or empty..
	private boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}

	// check string for special characters
	private boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

	// check string for valid email address - this is not for prod.
	// Just for demo. This fails for lots of valid emails.
	private boolean isValidEmail(String value) {
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
}
