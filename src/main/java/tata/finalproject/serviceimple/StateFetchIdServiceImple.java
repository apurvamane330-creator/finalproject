package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.State;
import tata.finalproject.repository.StateRepository;
import tata.finalproject.service.StateFetchIdService;

@Service
public class StateFetchIdServiceImple implements StateFetchIdService{
	
	@Autowired
	private StateRepository stateRepository;

	@Override
	public State fetchData(int id) {
		// TODO Auto-generated method stub
		return stateRepository.findById(id).orElse(null);
	}

}
