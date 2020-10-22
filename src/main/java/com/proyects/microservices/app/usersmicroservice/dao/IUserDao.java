package com.proyects.microservices.app.usersmicroservice.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.proyects.microservices.app.userscommonsmicroservice.models.UserCommons;

@RepositoryRestResource(path = "users")
public interface IUserDao extends PagingAndSortingRepository <UserCommons, Long>{
	
//	@RestResource(path="search-username")
//	public UserCommons findByUserName(@Param ("username") String username);
	
	@RestResource(path="search-username")
	@Query(value = "SELECT * FROM USERS U WHERE U.username=?", nativeQuery = true)
	public UserCommons findUserByUs(@Param ("username") String username);

}
