package com.anchtun.solid.interfacesegregation.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class Product extends BaseEntity {

	private String name;
	private String price;
}
