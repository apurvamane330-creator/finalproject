package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Category;
import tata.finalproject.repository.CategoryRepository;
import tata.finalproject.service.CategoryAddService;

@Service
public class CategoryAddServiceImple implements CategoryAddService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category addData(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

}
