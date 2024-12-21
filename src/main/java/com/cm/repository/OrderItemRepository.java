package com.cm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
