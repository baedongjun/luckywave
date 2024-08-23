package kr.co.luckywave.repository;

import java.util.List;

import kr.co.luckywave.model.Customer;
import kr.co.luckywave.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long>{

	List<CustomerOrder> findAllByCustomer(Customer customer);
}
