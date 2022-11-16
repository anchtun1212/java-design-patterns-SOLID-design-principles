package com.anchtun.designpatterns.structural.adapter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// An existing class used in our system
// Adaptee
// That means object of this class can work or can provide the functionality that is needed by our client code.
// So what is this client?
// So here we have a business card design class and this class is supposed to print business cards for its customers.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String fullName;
	private String jobTitle;
	private String officeLocation;
}
