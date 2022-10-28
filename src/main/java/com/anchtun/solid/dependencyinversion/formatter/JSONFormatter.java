package com.anchtun.solid.dependencyinversion.formatter;

import com.anchtun.solid.dependencyinversion.exception.FormatException;
import com.anchtun.solid.dependencyinversion.model.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Formats message to JSON format
public class JSONFormatter implements Formatter {

	public String format(Message message) throws FormatException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new FormatException(e);
		}
	}
}
