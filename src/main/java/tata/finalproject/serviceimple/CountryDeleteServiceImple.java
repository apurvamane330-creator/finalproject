package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.CountryRepository;
import tata.finalproject.service.CountryDeleteService;

@Service
public class CountryDeleteServiceImple implements CountryDeleteService{
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public String deleteData(int id) {
		
		countryRepository.deleteById(id);
		return "Town Deleted Successfully";
		
	}

}
