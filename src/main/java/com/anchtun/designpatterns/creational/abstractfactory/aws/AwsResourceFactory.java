package com.anchtun.designpatterns.creational.abstractfactory.aws;

import com.anchtun.designpatterns.creational.abstractfactory.factory.ResourceFactory;
import com.anchtun.designpatterns.creational.abstractfactory.product.Instance;
import com.anchtun.designpatterns.creational.abstractfactory.product.Instance.Capacity;
import com.anchtun.designpatterns.creational.abstractfactory.product.Storage;

// Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}

}