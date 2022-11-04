package com.anchtun.designpatterns.creational.builder.model;

import java.time.LocalDate;

import lombok.Data;

//Class used to construct the product
@Data
public class User {
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private Address address;
}
