package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Country;
import tata.finalproject.repository.CountryRepository;
import tata.finalproject.service.CountryAddService;

@Service
public class CountryAddServiceImple implements CountryAddService{
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Country addData(Country country) {
		// TODO Auto-generated method stub
		return countryRepository.save(country);
	}

}
