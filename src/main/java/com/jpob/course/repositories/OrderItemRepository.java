package com.jpob.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpob.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
