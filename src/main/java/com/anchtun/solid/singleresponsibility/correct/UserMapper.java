package com.anchtun.solid.singleresponsibility.correct;

import com.anchtun.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserMapper {

	public static User mapUser(String userJson) {
		ObjectMapper mapper = new ObjectMapper();
		User user = null;
		try {
			user = mapper.readValue(userJson, User.class);
		} catch (JsonMappingException e) {
			log.error("JsonMappingException:" + e.getMessage());
		} catch (JsonProcessingException e) {
			log.error("JsonProcessingException:" + e.getMessage());
		}
		return user;
	}
}
