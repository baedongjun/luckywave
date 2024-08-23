package kr.co.luckywave.repository;

import kr.co.luckywave.model.ProductTag;
import org.springframework.data.repository.CrudRepository;

public interface ProductTagRepository extends CrudRepository<ProductTag, Long>{
	
//	@Query(value = "SELECT DISTINCT tag_contents from product_tag" , nativeQuery = true)
//	List<ProductTag> findAllTags();
}
