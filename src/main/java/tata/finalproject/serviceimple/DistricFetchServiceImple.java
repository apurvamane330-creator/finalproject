package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Distric;
import tata.finalproject.repository.DistricRepository;
import tata.finalproject.service.DistricFetchService;

@Service
public class DistricFetchServiceImple implements DistricFetchService{
	
	@Autowired
	private DistricRepository districRepository;

	@Override
	public List<Distric> fetchData() {
		// TODO Auto-generated method stub
		return districRepository.findAll();
	}

}
