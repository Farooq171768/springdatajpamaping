package cgg.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdatajpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
