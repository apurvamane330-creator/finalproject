package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Category;
import tata.finalproject.repository.CategoryRepository;
import tata.finalproject.service.CategoryUpdateService;

@Service
public class CategoryUpdateServiceImple implements CategoryUpdateService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category updateData(Category category, int id) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}
	
	

}
