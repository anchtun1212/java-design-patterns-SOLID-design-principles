package com.anchtun.designpatterns.creational.abstractfactory.factory;

import com.anchtun.designpatterns.creational.abstractfactory.product.Instance;
import com.anchtun.designpatterns.creational.abstractfactory.product.Storage;

// Abstract factory with methods defined for each object type.
public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);

	Storage createStorage(int capMib);
}
