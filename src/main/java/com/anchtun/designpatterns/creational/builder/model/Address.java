package com.anchtun.designpatterns.creational.builder.model;

import lombok.Data;

@Data
public class Address {
	private String houseNumber;
	private String street;
	private String city;
	private String zipcode;
	private String state;
}
