package kr.co.luckywave.service;

import kr.co.luckywave.model.Customer;

public interface EmailSenderService {

	void sendActiveCode(Customer customer);
	
	void sendResetPasswordCode(Customer customer);
}
