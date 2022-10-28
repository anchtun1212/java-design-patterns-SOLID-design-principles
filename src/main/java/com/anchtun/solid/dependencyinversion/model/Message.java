package com.anchtun.solid.dependencyinversion.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Message {

	private String msg;
	private String currentTime;
}