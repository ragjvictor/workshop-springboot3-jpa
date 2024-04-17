package com.jacazezo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacazezo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
