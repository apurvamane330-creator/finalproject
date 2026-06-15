package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.SubCategory;
import tata.finalproject.repository.SubCategoryRepository;
import tata.finalproject.service.SubCategoryAddService;

@Service
public class SubCategoryAddServiceImple implements SubCategoryAddService{

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Override
	public SubCategory addData(SubCategory subCategory) {

		return subCategoryRepository.save(subCategory);
	}

}
