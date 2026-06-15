package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.SubCategory;
import tata.finalproject.repository.SubCategoryRepository;
import tata.finalproject.service.SubCategoryUpdateService;

@Service
public class SubCategoryUpdateServiceImple implements SubCategoryUpdateService{
	
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Override
	public SubCategory updateData(SubCategory subCategory, int id) {
		// TODO Auto-generated method stub
		return subCategoryRepository.save(subCategory);
	}

}
