package kr.co.luckywave.repository;

import kr.co.luckywave.model.Customer;
import kr.co.luckywave.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByAuthorityAndCustomer(String auth, Customer customer);
}
