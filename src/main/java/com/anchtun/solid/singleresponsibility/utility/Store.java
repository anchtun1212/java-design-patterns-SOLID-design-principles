package com.anchtun.solid.singleresponsibility.utility;

import java.util.HashMap;
import java.util.Map;

import com.anchtun.solid.singleresponsibility.model.User;

// Store data in memory
public class Store {

	public static final Map<String, User> STORAGE = new HashMap<>();

	public void store(User user) {
		synchronized (STORAGE) {
			STORAGE.put(user.getName(), user);
		}
	}

	public User getUser(String name) {
		synchronized (STORAGE) {
			return STORAGE.get(name);
		}
	}
}
