package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.DistricRepository;
import tata.finalproject.service.DistricDeleteService;

@Service
public class DistricDeleteServiceImple implements DistricDeleteService {
	
	@Autowired
	private DistricRepository districRepository;

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub

		districRepository.deleteById(id);
		return "Town Deleted Successfully";
	}

}
