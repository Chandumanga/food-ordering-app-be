package com.cm.service;

import com.cm.Exception.CartException;
import com.cm.Exception.CartItemException;
import com.cm.Exception.FoodException;
import com.cm.Exception.UserException;
import com.cm.model.Cart;
import com.cm.model.CartItem;
import com.cm.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
