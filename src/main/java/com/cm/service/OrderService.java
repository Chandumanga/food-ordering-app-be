package com.cm.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.cm.Exception.CartException;
import com.cm.Exception.OrderException;
import com.cm.Exception.RestaurantException;
import com.cm.Exception.UserException;
import com.cm.model.Order;
import com.cm.model.PaymentResponse;
import com.cm.model.User;
import com.cm.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
