package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Country;
import tata.finalproject.repository.CountryRepository;
import tata.finalproject.service.CountryFetchIdService;

@Service
public class CountryFetchIdServiceImple implements CountryFetchIdService{
	
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Country fetchData(int id) {
		// TODO Auto-generated method stub
		return countryRepository.findById(id).orElse(null);
	}

}
