package com.anchtun.designpatterns.creational.builder.impl2.client;

import java.time.LocalDate;

import com.anchtun.designpatterns.creational.builder.impl2.dto.UserDTO;
import com.anchtun.designpatterns.creational.builder.impl2.dto.UserDTO.UserDTOBuilder;
import com.anchtun.designpatterns.creational.builder.model.Address;
import com.anchtun.designpatterns.creational.builder.model.User;

import lombok.extern.slf4j.Slf4j;

//This is our client which also works as "director"
@Slf4j
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		// Client has to provide director with concrete builder
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		log.info("\n" + dto.toString());
	}
	
	/**
	 * This method serves the role of director in builder pattern. 
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		//So what is method changing?
		//So since withFirstName returns the builder instance itself, we can directly put DOT here and call
		//the next method on the builder.
		//So this ability to change one method after another is what is called method chaining, and it makes
		//it easier to write a lengthy piece of code so we can now build the next part, which is the last name.
		return builder.withFirstName(user.getFirstName())
			   .withLastName(user.getLastName())
			   .withAddress(user.getAddress())
			   .withBirthday(user.getBirthday())
			   .build();
	}
	
	/**
	 * Returns a sample user. 
	 * Could be from DB
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1919, 2, 3));
		user.setFirstName("Mohamed");
		user.setLastName("Charrada");
		Address address = new Address();
		address.setHouseNumber("67");
		address.setStreet("Riyadh");
		address.setCity("Riyadh");
		address.setState("Riyadh");
		address.setZipcode("12345");
		user.setAddress(address);
		return user;
	}
}