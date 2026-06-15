package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Taluka;
import tata.finalproject.repository.TalukaRepository;
import tata.finalproject.service.TalukaFetchIdService;

@Service
public class TalukaFetchIdServiceImple implements TalukaFetchIdService{
	
	@Autowired
	private TalukaRepository talukaRepository;

	@Override
	public Taluka fetchData(int id) {
		// TODO Auto-generated method stub
		return talukaRepository.findById(id).orElse(null);
	}

}
