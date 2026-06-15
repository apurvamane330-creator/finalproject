package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Town;
import tata.finalproject.repository.TownRepository;
import tata.finalproject.service.TownFetchIdService;

@Service
public class TownFetchIdServiceImple implements TownFetchIdService{
	
	@Autowired
	  private TownRepository townRepository;

	@Override
	public Town fetchData(int id) {
		// TODO Auto-generated method stub
		return townRepository.findById(id).orElse(null);
	}

}
