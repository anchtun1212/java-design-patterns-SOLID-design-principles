package com.anchtun.solid.singleresponsibility.correct;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.anchtun.solid.singleresponsibility.model.User;

//So this class will change only if something changes in our validation logic.
//It will not get affected if we change, for example, how we store the user object.
//This class is not going to change.
public class UserValidator {

	// Validates the user object
	public static boolean isValidUser(User user) {
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
	public static boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}

	// check string for special characters
	public static boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

	// check string for valid email address - this is not for prod.
	// Just for demo. This fails for lots of valid emails.
	public static boolean isValidEmail(String value) {
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
}
