package com.anchtun.designpatterns.behavioral.interpreter.expression;

import com.anchtun.designpatterns.behavioral.interpreter.context.User;

// Abstract expression
public interface PermissionExpression {

	boolean interpret(User user);
}
