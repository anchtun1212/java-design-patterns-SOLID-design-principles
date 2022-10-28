package com.anchtun.solid.interfacesegregation.wrong;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.anchtun.solid.interfacesegregation.model.Product;

public class ProductPersistenceService implements PersistenceService<Product> {

	private static final Map<Long, Product> PRODUCTS = new HashMap<>();

	@Override
	public void save(Product entity) {
		synchronized (PRODUCTS) {
			PRODUCTS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Product entity) {
		synchronized (PRODUCTS) {
			PRODUCTS.remove(entity.getId());
		}
	}

	@Override
	public Product findById(Long id) {
		synchronized (PRODUCTS) {
			return PRODUCTS.get(id);
		}
	}

	@Override
	public List<Product> findByName(String name) {
		synchronized (PRODUCTS) {
			return PRODUCTS.values().stream().filter(u -> u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
	}

	@Override
	public List<Product> findByUserName(String userName) {
		throw new UnsupportedOperationException("findByUserName is not supported");
	}
}
