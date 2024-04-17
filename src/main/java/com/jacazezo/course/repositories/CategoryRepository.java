package com.jacazezo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacazezo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
