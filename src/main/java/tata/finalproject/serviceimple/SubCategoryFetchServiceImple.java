package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.SubCategory;
import tata.finalproject.repository.SubCategoryRepository;
import tata.finalproject.service.SubCategoryFetchService;

@Service
public class SubCategoryFetchServiceImple implements SubCategoryFetchService{
	
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Override
	public List<SubCategory> fetchData() {
		// TODO Auto-generated method stub
		return subCategoryRepository.findAll();
	}

}
