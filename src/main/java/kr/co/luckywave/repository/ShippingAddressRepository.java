package kr.co.luckywave.repository;

import java.util.List;

import kr.co.luckywave.model.Customer;
import kr.co.luckywave.model.ShippingAddress;
import org.springframework.data.repository.CrudRepository;

public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long>{
	
	List<ShippingAddress> findAllByCustomer(Customer customer);
	
	
}
