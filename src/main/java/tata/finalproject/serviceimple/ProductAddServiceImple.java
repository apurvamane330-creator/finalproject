package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Product;
import tata.finalproject.repository.ProductRepository;
import tata.finalproject.service.ProductAddService;

@Service
public class ProductAddServiceImple implements ProductAddService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addData(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
