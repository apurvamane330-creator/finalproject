package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.SubCategoryRepository;
import tata.finalproject.service.SubCategoryDeleteService;

@Service
public class SubCategoryDeleteServiceImple implements SubCategoryDeleteService{
	
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Override
	public String deleteData(int id) {
		
		subCategoryRepository.deleteById(id);
		return "Town Deleted Successfully";
		
	}

}
