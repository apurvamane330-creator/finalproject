package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Distric;
import tata.finalproject.repository.DistricRepository;
import tata.finalproject.service.DistricFetchIdService;

@Service
public class DistricFetchIdServiceImple implements DistricFetchIdService{
	
	@Autowired
	private DistricRepository districRepository;

	@Override
	public Distric fetchData(int id) {
		// TODO Auto-generated method stub
		return districRepository.findById(id).orElse(null);
	}

}
