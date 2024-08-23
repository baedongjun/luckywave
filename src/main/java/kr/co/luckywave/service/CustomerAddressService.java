package kr.co.luckywave.service;

import java.util.List;

import kr.co.luckywave.model.ShippingAddress;

public interface CustomerAddressService {
	
	List<ShippingAddress> getAllShippingAddressByCustomerId(Object customerId);
	
	void addShippingAddressObject(Object customerId, ShippingAddress shippingAddress);
}
