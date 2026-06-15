package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Distric;
import tata.finalproject.repository.DistricRepository;
import tata.finalproject.service.DistricAddService;

@Service
public class DistricAddServiceImple implements DistricAddService{
	
	@Autowired
	private DistricRepository districRepository;

	@Override
	public Distric addData(Distric distric) {
		// TODO Auto-generated method stub
		return districRepository.save(distric);
	}

}
