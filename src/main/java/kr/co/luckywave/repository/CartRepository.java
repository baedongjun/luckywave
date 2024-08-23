package kr.co.luckywave.repository;

import javax.transaction.Transactional;

import kr.co.luckywave.model.Cart;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CartRepository extends CrudRepository<Cart, Long>{
	
}
