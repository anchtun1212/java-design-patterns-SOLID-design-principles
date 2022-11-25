package com.anchtun.designpatterns.behavioral.interpreter.builder;

import java.util.Stack;
import java.util.StringTokenizer;

import com.anchtun.designpatterns.behavioral.interpreter.Report;
import com.anchtun.designpatterns.behavioral.interpreter.expression.AndExpression;
import com.anchtun.designpatterns.behavioral.interpreter.expression.NotExpression;
import com.anchtun.designpatterns.behavioral.interpreter.expression.OrExpression;
import com.anchtun.designpatterns.behavioral.interpreter.expression.Permission;
import com.anchtun.designpatterns.behavioral.interpreter.expression.PermissionExpression;

// Parses & builds abstract syntax tree
public class ExpressionBuilder {
	
	// The Stack class represents a last-in-first-out (LIFO) stack of objects
	private Stack<PermissionExpression> permissions = new Stack<>();
	private Stack<String> operators = new Stack<>();

	public PermissionExpression build(Report report) {
		parse(report.getPermission());
		buildExpressions();
		if (permissions.size() > 1 || !operators.isEmpty()) {
			System.out.println("ERROR!");
		}
		return permissions.pop();
	}

	private void parse(String permission) {
		// The string tokenizer class allows an application to break a string into tokens.
		StringTokenizer tokenizer = new StringTokenizer(permission.toUpperCase());
		while (tokenizer.hasMoreTokens()) {
			String token;
			switch ((token = tokenizer.nextToken())) {
			case "AND":
				operators.push("AND");
				break;
			case "NOT":
				operators.push("NOT");
				break;
			case "OR":
				operators.push("OR");
				break;
			default:
				permissions.push(new Permission(token));
				break;
			}
		}
	}

	private void buildExpressions() {
		while (!operators.isEmpty()) {
			String operator = operators.pop();
			PermissionExpression perm1;
			PermissionExpression perm2;
			PermissionExpression exp;
			switch (operator) {
			case "NOT":
				perm1 = permissions.pop();
				exp = new NotExpression(perm1);
				break;
			case "AND":
				perm1 = permissions.pop();
				perm2 = permissions.pop();
				exp = new AndExpression(perm1, perm2);
				break;
			case "OR":
				perm1 = permissions.pop();
				perm2 = permissions.pop();
				exp = new OrExpression(perm1, perm2);
				break;
			default:
				throw new IllegalArgumentException("Unknown operator:" + operator);
			}
			permissions.push(exp);
		}
	}
}