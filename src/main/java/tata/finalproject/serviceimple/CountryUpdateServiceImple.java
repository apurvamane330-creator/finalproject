package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Country;
import tata.finalproject.repository.CountryRepository;
import tata.finalproject.service.CountryUpdateService;

@Service
public class CountryUpdateServiceImple implements CountryUpdateService {
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Country updateData(Country country, int id) {
		// TODO Auto-generated method stub
		return countryRepository.save(country);
	}

}
