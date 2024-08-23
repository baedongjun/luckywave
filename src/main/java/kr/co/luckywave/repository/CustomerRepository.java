package kr.co.luckywave.repository;

import javax.transaction.Transactional;

import kr.co.luckywave.model.Customer;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	Customer findByEmail(String email);
	
}
