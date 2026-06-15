package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Taluka;
import tata.finalproject.repository.TalukaRepository;
import tata.finalproject.service.TalukaFetchService;

@Service
public class TalukaFetchServiceImple implements TalukaFetchService{
	
	@Autowired
	private TalukaRepository talukaRepository;

	@Override
	public List<Taluka> fetchData() {
		// TODO Auto-generated method stub
		return talukaRepository.findAll();
	}

}
