package com.giffgaff.userapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giffgaff.userapp.model.User;

@Repository
public interface UserServiceDAO extends CrudRepository<User, Long> {

}
