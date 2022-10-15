package com.deloitte.cartservice.service;

import java.util.List;

import com.deloitte.cartservice.model.Cart;

public interface CartService {
	
	Cart addItemToCart(Cart cartItem);
	List<Cart> getUserCartItems(String username);

}
