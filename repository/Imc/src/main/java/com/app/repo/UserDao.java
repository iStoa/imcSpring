package com.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.User;

public interface UserDao extends CrudRepository<User, String>{

}
