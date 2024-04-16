package com.jacazezo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacazezo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
