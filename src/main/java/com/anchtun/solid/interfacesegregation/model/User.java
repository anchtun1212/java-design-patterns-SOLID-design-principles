package com.anchtun.solid.interfacesegregation.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class User extends BaseEntity {

	private String name;
	private String userName;
}
