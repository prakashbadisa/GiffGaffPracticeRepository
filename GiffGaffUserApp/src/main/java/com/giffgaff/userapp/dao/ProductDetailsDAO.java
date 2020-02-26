package com.giffgaff.userapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giffgaff.userapp.model.Product;

@Repository
public interface ProductDetailsDAO extends CrudRepository<Product, Long> {

}
