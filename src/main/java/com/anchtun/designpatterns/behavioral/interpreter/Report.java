package com.anchtun.designpatterns.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Report {

	private String name;
	// "NOT ADMIN", "FINANCE_USER AND ADMIN"
	private String permission;
}