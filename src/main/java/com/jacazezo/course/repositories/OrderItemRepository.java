package com.jacazezo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacazezo.course.entities.OrderItem;
import com.jacazezo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
