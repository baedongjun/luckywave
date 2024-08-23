package kr.co.luckywave.repository;

import java.util.List;

import kr.co.luckywave.model.Product;
import kr.co.luckywave.model.ProductComment;
import org.springframework.data.repository.CrudRepository;

public interface ProductCommentRepository extends CrudRepository<ProductComment, Long>{
	List<ProductComment> findByProduct(Product product);
}
