package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Country;
import tata.finalproject.repository.CountryRepository;
import tata.finalproject.service.CountryFetchService;

@Service
public class CountryFetchServiceImple implements CountryFetchService{
	
	@Autowired
	private CountryRepository countryRepository;


	@Override
	public List<Country> fetchData() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

}
