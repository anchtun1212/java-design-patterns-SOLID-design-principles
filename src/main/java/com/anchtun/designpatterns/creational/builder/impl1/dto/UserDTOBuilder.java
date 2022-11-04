package com.anchtun.designpatterns.creational.builder.impl1.dto;

import java.time.LocalDate;

import com.anchtun.designpatterns.creational.builder.model.Address;

//Abstract builder
public interface UserDTOBuilder {
	//methods to build "parts" of product at a time
	UserDTOBuilder withFirstName(String fname) ;
	UserDTOBuilder withLastName(String lname);
	UserDTOBuilder withBirthday(LocalDate date);
	UserDTOBuilder withAddress(Address address);
	
	//method to "assemble" final product
	UserDTO build();
	//(optional) method to fetch already built object
	UserDTO getUserDTO();
}