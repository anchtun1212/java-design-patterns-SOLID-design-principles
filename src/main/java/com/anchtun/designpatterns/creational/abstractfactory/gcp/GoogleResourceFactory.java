package com.anchtun.designpatterns.creational.abstractfactory.gcp;

import com.anchtun.designpatterns.creational.abstractfactory.factory.ResourceFactory;
import com.anchtun.designpatterns.creational.abstractfactory.product.Instance;
import com.anchtun.designpatterns.creational.abstractfactory.product.Instance.Capacity;
import com.anchtun.designpatterns.creational.abstractfactory.product.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMB) {
		return new GoogleCloudStorage(capMB);
	}

}