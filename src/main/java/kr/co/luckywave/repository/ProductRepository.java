package kr.co.luckywave.repository;

import java.util.List;

import kr.co.luckywave.model.Category;
import kr.co.luckywave.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long>{
	
	List<Product> findAllByOrderByProductViewsDesc();
	
	List<Product> findAllByProductCategory(Category category);
	
}
