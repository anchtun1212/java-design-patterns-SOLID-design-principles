package com.anchtun.designpatterns.behavioral.interpreter.client;

import com.anchtun.designpatterns.behavioral.interpreter.Report;
import com.anchtun.designpatterns.behavioral.interpreter.builder.ExpressionBuilder;
import com.anchtun.designpatterns.behavioral.interpreter.context.User;
import com.anchtun.designpatterns.behavioral.interpreter.expression.PermissionExpression;

public class Client {

	public static void main(String[] args) {
		Report report1 = new Report("Report 1", "FINANCE_ADMIN OR ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();
		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);
		User user1 = new User("Mohamed", "USER");
		System.out.println("User: " + user1.getUsername() + " access report: " + exp.interpret(user1));
		User user2 = new User("Anchtun", "ADMIN");
		System.out.println("User: " + user2.getUsername() + " access report: " + exp.interpret(user2));
	}

}