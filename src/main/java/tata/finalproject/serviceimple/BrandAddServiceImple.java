package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Brand;
import tata.finalproject.repository.BrandRepository;
import tata.finalproject.service.BrandAddService;

@Service
public class BrandAddServiceImple implements BrandAddService {
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand addData(Brand brand) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

}
