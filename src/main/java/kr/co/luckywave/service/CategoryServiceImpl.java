package kr.co.luckywave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.luckywave.model.Category;
import kr.co.luckywave.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepostitory;
	
	public List<String> getAllSubCategory(){
		return categoryRepostitory.findAllSubCategoryName();
	}
	
	public List<String> getAllMainCategory(){
		return categoryRepostitory.findAllMainCategoryName();
	}
	
	public List<Category> getAllCategory(){
		return (List<Category>) categoryRepostitory.findAll();
	}
	
	public void save(Category category){
		categoryRepostitory.save(category);
	}
	
	public void delete(Long categoryId){
		categoryRepostitory.delete(categoryId);
	}
	
	public Category getCategoryById(Long categoryId){
		return categoryRepostitory.findOne(categoryId);
	}
}
