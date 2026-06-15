package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Category;
import tata.finalproject.repository.CategoryRepository;
import tata.finalproject.service.CategoryFetchService;

@Service
public class CategoryFetchServiceImple implements CategoryFetchService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> fetchData() {
		
		return categoryRepository.findAll();
	}

}
