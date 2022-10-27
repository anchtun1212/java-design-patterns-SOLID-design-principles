package com.anchtun.solid.singleresponsibility.correct;

import java.io.IOException;

import com.anchtun.constant.Constants;
import com.anchtun.model.User;

//Handles incoming JSON requests that work on User resource/entity
public class UserControllerCorrect {

	// Create a new user
	public String createUser(String userJson) throws IOException {
		User user = UserMapper.mapUser(userJson);
		if (!UserValidator.isValidUser(user)) {
			return Constants.ERROR;
		}
		UserPersistenceService.saveUser(user);
		return Constants.SUCCESS;
	}
}
