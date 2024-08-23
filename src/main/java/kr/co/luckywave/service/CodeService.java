package kr.co.luckywave.service;

import java.util.List;

import kr.co.luckywave.model.Code;
import kr.co.luckywave.model.Customer;

public interface CodeService {
	
	List<Code> findByCodeTypeAndCustomer(int codeType, Customer customer);
	
	void save(Code code);
	
	Code findByCodeStr(String codeStr);
	
	void delete(Code code);
}
