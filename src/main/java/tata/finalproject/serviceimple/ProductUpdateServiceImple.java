package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Product;
import tata.finalproject.repository.ProductRepository;
import tata.finalproject.service.ProductUpdateService;

@Service
public class ProductUpdateServiceImple implements ProductUpdateService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product updateData(Product product, int id) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
