package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Town;
import tata.finalproject.repository.TownRepository;
import tata.finalproject.service.TownFetchService;

@Service
public class TownFetchServiceImple implements TownFetchService{
	
	 @Autowired
	 private TownRepository townRepository;

	@Override
	public List<Town> fetchData() {
		// TODO Auto-generated method stub
		return townRepository.findAll();
	}

}
