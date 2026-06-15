package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Brand;
import tata.finalproject.repository.BrandRepository;
import tata.finalproject.service.BrandFetchService;

@Service
public class BrandFetchServiceImple implements BrandFetchService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public List<Brand> fetchData() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

}
