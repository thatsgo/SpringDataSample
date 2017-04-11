package com.sample.spring.repositoru;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.spring.dao.pojo.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}
