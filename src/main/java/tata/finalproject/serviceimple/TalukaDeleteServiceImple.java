package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.TalukaRepository;
import tata.finalproject.service.TalukaDeleteService;

@Service
public class TalukaDeleteServiceImple implements TalukaDeleteService {
	
	@Autowired
	private TalukaRepository talukaRepository;

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub
		talukaRepository.deleteById(id);
		return "Town Deleted Successfully";
		
	}

}
