package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Category;
import tata.finalproject.repository.CategoryRepository;
import tata.finalproject.service.CategoryFetchIdService;

@Service
public class CategoryFetchIdServiceImple implements CategoryFetchIdService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category fetchData(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).orElse(null);
	}

}
