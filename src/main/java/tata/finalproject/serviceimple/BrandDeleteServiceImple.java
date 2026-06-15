package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.BrandRepository;
import tata.finalproject.service.BrandDeleteService;

@Service
public class BrandDeleteServiceImple implements BrandDeleteService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public String deleteData(int id) {

		brandRepository.deleteById(id);
		return "Town Deleted Successfully";
	}

}
