package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Product;
import tata.finalproject.repository.ProductRepository;
import tata.finalproject.service.ProductFetchIdService;

@Service
public class ProductFetchIdServiceImple implements ProductFetchIdService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product fetchData(int id) {
		
		return productRepository.findById(id).orElse(null);
	}

}
