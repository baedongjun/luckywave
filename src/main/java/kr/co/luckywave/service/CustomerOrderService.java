package kr.co.luckywave.service;

import java.io.IOException;
import java.util.List;

import kr.co.luckywave.model.Cart;
import kr.co.luckywave.model.Customer;
import kr.co.luckywave.model.CustomerOrder;
import kr.co.luckywave.model.CustomerOrderShippingAddress;

public interface CustomerOrderService {
	
	double getCustomerOrderGrandTotalByCart(Cart cart);
	
	void addOrderDumpCart(CustomerOrderShippingAddress customerOrderShippingAddress, CustomerOrder customerOrder, Cart cart) throws IOException;
	
	List<CustomerOrder> getAllCustomerOrderByCustomer(Customer customer);
}
