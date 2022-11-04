package com.anchtun.designpatterns.creational.builder.impl2.dto;

import java.time.LocalDate;
import java.time.Period;

import com.anchtun.designpatterns.creational.builder.model.Address;

import lombok.Data;

//You will find that this type of implementation is always preferred way to implement the builder pattern,
//even if the immutability of the final object is not your main concern or which is something that you
//don't require, because having a builder inside the product class gives it a nice namespace.

//Product class
@Data
public class UserDTO {
	private String name;
	private String address;
	private String age;

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address;
	}

	// Get builder instance
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}

	// Builder
	public static class UserDTOBuilder {
		private String firstName;
		private String lastName;
		private String age;
		private String address;
		private UserDTO userDTO;

		public UserDTOBuilder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		public UserDTOBuilder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		public UserDTOBuilder withBirthday(LocalDate date) {
			age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
			return this;
		}

		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber() + " " + address.getStreet() + "\n" + address.getCity() + ", "
					+ address.getState() + " " + address.getZipcode();

			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(firstName + " " + lastName);
			userDTO.setAddress(address);
			userDTO.setAge(age);
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
