package com.cm.service;

import com.stripe.exception.StripeException;
import com.cm.model.Order;
import com.cm.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
