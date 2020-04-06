package com.minishop.minishop.catalog;

import org.springframework.data.repository.CrudRepository;

import com.minishop.minishop.catalog.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
