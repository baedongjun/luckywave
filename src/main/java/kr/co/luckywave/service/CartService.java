package kr.co.luckywave.service;

import java.io.IOException;

import kr.co.luckywave.model.Cart;

public interface CartService {
	
	Cart validate(Object customerId) throws IOException;
	
	void emptyCart(Cart cart);
	
	void save(Cart cart);
}
