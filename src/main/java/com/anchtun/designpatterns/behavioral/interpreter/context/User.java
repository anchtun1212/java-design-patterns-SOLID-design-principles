package com.anchtun.designpatterns.behavioral.interpreter.context;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {

	private List<String> permissions;
	private String username;

	public User(String username, String... permissions) {
		this.username = username;
		this.permissions = new ArrayList<>();
		Stream.of(permissions).forEach(e -> this.permissions.add(e.toUpperCase()));
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public String getUsername() {
		return username;
	}

}