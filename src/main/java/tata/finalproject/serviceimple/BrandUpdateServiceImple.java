package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Brand;
import tata.finalproject.repository.BrandRepository;
import tata.finalproject.service.BrandUpdateService;

@Service
public class BrandUpdateServiceImple implements BrandUpdateService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand updateData(Brand brand, int id) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

}
