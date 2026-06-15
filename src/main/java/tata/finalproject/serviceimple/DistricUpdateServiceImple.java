package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Distric;
import tata.finalproject.repository.DistricRepository;
import tata.finalproject.service.DistricUpdateService;

@Service
public class DistricUpdateServiceImple implements DistricUpdateService{
	
	@Autowired
	private DistricRepository districRepository;

	@Override
	public Distric updateData(Distric distric, int id) {
		// TODO Auto-generated method stub
		return districRepository.save(distric);
	}

}
