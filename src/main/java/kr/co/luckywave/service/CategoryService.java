package kr.co.luckywave.service;

import java.util.List;

import kr.co.luckywave.model.Category;

public interface CategoryService {
	
	List<Category> getAllCategory();
	
	List<String> getAllMainCategory();

	List<String> getAllSubCategory();
	
	void save(Category category);
	
	void delete(Long categoryId);
	
	Category getCategoryById(Long categoryId);
}
