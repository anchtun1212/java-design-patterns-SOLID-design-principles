package com.anchtun.solid.singleresponsibility.correct;

import com.anchtun.model.User;
import com.anchtun.utility.Store;

public class UserPersistenceService {

	private static Store store = new Store();
	public static void saveUser(User user) {
		store.store(user);
	}
}
