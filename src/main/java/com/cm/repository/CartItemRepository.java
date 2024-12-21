package com.cm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
