package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Taluka;
import tata.finalproject.repository.TalukaRepository;
import tata.finalproject.service.TalukaUpdateService;

@Service
public class TalukaUpdateServiceImple implements TalukaUpdateService{
	
	@Autowired
	private TalukaRepository talukaRepository;

	@Override
	public Taluka updateData(Taluka taluka, int id) {
		// TODO Auto-generated method stub
		return talukaRepository.save(taluka);
	}

}
