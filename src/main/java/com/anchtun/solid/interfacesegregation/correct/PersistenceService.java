package com.anchtun.solid.interfacesegregation.correct;

import java.util.List;

import com.anchtun.solid.interfacesegregation.model.BaseEntity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends BaseEntity> {

	void save(T entity);
	void delete(T entity);
	T findById(Long id);
	List<T> findByName(String name);
}
