package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Town;
import tata.finalproject.repository.TownRepository;
import tata.finalproject.service.TownUpdateService;

@Service
public class TownUpdateServiceImple implements TownUpdateService{
	
	  @Autowired
	  private TownRepository townRepository;

	@Override
	public Town updateData(Town town, int id) {
		// TODO Auto-generated method stub
		return townRepository.save(town);
	}

}
