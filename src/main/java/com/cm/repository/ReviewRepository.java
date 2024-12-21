package com.cm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
