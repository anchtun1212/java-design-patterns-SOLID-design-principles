package com.anchtun.designpatterns.behavioral.interpreter.expression;

import com.anchtun.designpatterns.behavioral.interpreter.context.User;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotExpression implements PermissionExpression {

	private PermissionExpression expression;

	@Override
	public boolean interpret(User user) {
		return !expression.interpret(user);
	}

	@Override
	public String toString() {
		return " NOT " + expression;
	}
}