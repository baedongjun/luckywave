package kr.co.luckywave.repository;

import org.springframework.data.repository.CrudRepository;

import kr.co.luckywave.model.CustomerOrderItem;

public interface CustomerOrderItemRepository extends CrudRepository <CustomerOrderItem, Long>{

}
