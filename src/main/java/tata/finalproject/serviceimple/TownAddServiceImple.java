package tata.finalproject.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Town;
import tata.finalproject.repository.TownRepository;
import tata.finalproject.service.TownAddService;

@Service
public class TownAddServiceImple implements TownAddService{
	
    @Autowired
    private TownRepository townRepository;

	@Override
	public Town addData(Town town) {
		// TODO Auto-generated method stub
		return townRepository.save(town);
	}

}
