package com.anchtun.solid.singleresponsibility.correct;

import com.anchtun.solid.singleresponsibility.model.User;
import com.anchtun.solid.singleresponsibility.utility.Store;

public class UserPersistenceService {

	private static Store store = new Store();
	public static void saveUser(User user) {
		store.store(user);
	}
}
