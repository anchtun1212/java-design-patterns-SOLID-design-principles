package com.anchtun.solid.interfacesegregation.wrong;

import java.util.List;

import com.anchtun.solid.interfacesegregation.model.BaseEntity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends BaseEntity> {

	void save(T entity);
	void delete(T entity);
	T findById(Long id);
	List<T> findByName(String name);
	//We have an interface that contains methods that don't make sense for some of the implementing classes.
	//Well, the idea here is that to break your interfaces, that is one solution.
	//Second is that if a method in an interface is applicable to only a single class, then we can either
	//remove that definition and put that only in the class for which it actually makes sense.
	List<T> findByUserName(String userName);
}
