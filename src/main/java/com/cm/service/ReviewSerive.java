package com.cm.service;

import java.util.List;

import com.cm.Exception.ReviewException;
import com.cm.model.Review;
import com.cm.model.User;
import com.cm.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
