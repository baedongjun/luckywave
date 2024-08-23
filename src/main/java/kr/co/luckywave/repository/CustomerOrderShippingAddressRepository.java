package kr.co.luckywave.repository;

import kr.co.luckywave.model.CustomerOrderShippingAddress;
import org.springframework.data.repository.CrudRepository;

public interface CustomerOrderShippingAddressRepository 
					extends CrudRepository <CustomerOrderShippingAddress, Long> {

}
