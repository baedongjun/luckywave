package kr.co.luckywave.repository;

import java.util.List;

import kr.co.luckywave.model.Code;
import kr.co.luckywave.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CodeRepository extends CrudRepository<Code, Long>{
	
	List<Code> findByCodeTypeAndCustomer(int codeType, Customer customer);
	
	Code findByCodeStr(String codeStr);
}
