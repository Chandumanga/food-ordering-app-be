package com.cm.service;

import java.util.List;

import com.cm.model.Notification;
import com.cm.model.Order;
import com.cm.model.Restaurant;
import com.cm.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
