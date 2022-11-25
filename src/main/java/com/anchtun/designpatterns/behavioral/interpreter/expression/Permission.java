package com.anchtun.designpatterns.behavioral.interpreter.expression;

import com.anchtun.designpatterns.behavioral.interpreter.context.User;

// Terminal expression
public class Permission implements PermissionExpression {

	private String permission;

	public Permission(String permission) {
		this.permission = permission.toUpperCase();
	}

	@Override
	public boolean interpret(User user) {
		return user.getPermissions().contains(permission);
	}

	@Override
	public String toString() {
		return permission;
	}

}
