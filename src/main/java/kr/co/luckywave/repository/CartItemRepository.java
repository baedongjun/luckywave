package kr.co.luckywave.repository;

import javax.transaction.Transactional;

import kr.co.luckywave.model.CartItem;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{

}
