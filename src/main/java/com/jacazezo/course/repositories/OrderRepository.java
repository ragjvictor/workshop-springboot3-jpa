package com.jacazezo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacazezo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
