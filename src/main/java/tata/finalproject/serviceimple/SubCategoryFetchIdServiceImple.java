package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.SubCategory;
import tata.finalproject.repository.SubCategoryRepository;
import tata.finalproject.service.SubCategoryFetchIdService;

@Service
public class SubCategoryFetchIdServiceImple implements SubCategoryFetchIdService{
	
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Override
	public SubCategory fetchData(int id) {
		// TODO Auto-generated method stub
		return subCategoryRepository.findById(id).orElse(null);
	}

}
