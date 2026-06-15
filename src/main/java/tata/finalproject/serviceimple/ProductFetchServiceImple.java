package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Product;
import tata.finalproject.repository.ProductRepository;
import tata.finalproject.service.ProductFetchService;

@Service
public class ProductFetchServiceImple implements ProductFetchService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> fetchData() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
