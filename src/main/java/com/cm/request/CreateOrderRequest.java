package com.cm.request;

import com.cm.model.Address;

import lombok.Data;

@Data
public class CreateOrderRequest {
 
	private Long restaurantId;
	
	private Address deliveryAddress;
	
    
}
