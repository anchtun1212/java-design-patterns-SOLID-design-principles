package com.anchtun.designpatterns.behavioral.interpreter.expression;

import com.anchtun.designpatterns.behavioral.interpreter.context.User;

import lombok.AllArgsConstructor;

// Non terminal expression
@AllArgsConstructor
public class OrExpression implements PermissionExpression {

	private PermissionExpression expression1;
	private PermissionExpression expression2;

	@Override
	public boolean interpret(User user) {
		return expression1.interpret(user) || expression2.interpret(user);
	}

	@Override
	public String toString() {
		return expression1 + " OR " + expression2;
	}
}