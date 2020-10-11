package com.proyects.microservices.app.usersmicroservice.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proyects.microservices.app.usersmicroservice.models.User;

@RepositoryRestResource(path = "users")
public interface IUserDao extends PagingAndSortingRepository <User, Long>{
	
	public User findByUserName(String username);
	
//	@Query(value = "SELECT * FROM USERS U WHERE U.ID=?", nativeQuery = true)
	public User findUserById(Long id);

}
