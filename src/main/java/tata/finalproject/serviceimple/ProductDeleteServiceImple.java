package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.ProductRepository;
import tata.finalproject.service.ProductDeleteService;

@Service
public class ProductDeleteServiceImple implements ProductDeleteService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String deleteData(int id) {
		
		productRepository.deleteById(id);
		return "Town Deleted Successfully";
	}

}
