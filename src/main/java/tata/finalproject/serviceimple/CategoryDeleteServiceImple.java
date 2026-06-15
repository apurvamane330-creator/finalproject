package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.CategoryRepository;
import tata.finalproject.service.CategoryDeleteService;

@Service
public class CategoryDeleteServiceImple implements CategoryDeleteService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public String deleteData(int id) {
		
		categoryRepository.deleteById(id);
		return "Town Deleted Successfully";
		
	}

}
