package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Brand;
import tata.finalproject.repository.BrandRepository;
import tata.finalproject.service.BrandFetchIdService;

@Service
public class BrandFetchIdServiceImple implements BrandFetchIdService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand fetchData(int id) {
		// TODO Auto-generated method stub
		return brandRepository.findById(id).orElse(null);
	}

}
