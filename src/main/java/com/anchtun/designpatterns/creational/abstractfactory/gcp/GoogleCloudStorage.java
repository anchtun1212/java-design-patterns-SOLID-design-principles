package com.anchtun.designpatterns.creational.abstractfactory.gcp;

import com.anchtun.designpatterns.creational.abstractfactory.product.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleCloudStorage implements Storage {

	public GoogleCloudStorage(int capacityInMB) {
		// Use gcp api
		System.out.println("Allocated " + capacityInMB + " on Google Cloud Storage");
	}

	@Override
	public String getId() {
		return "gcpcs1";
	}

	@Override
	public String toString() {
		return "Google cloud storage";
	}
}