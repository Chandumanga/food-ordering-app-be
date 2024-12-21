package com.cm.service;

import java.util.List;

import com.cm.Exception.FoodException;
import com.cm.Exception.RestaurantException;
import com.cm.model.Category;
import com.cm.model.Food;
import com.cm.model.Restaurant;
import com.cm.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
