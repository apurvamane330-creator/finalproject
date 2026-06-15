package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.State;
import tata.finalproject.repository.StateRepository;
import tata.finalproject.service.StateAddService;

@Service
public class StateAddServiceImple implements StateAddService{
	
	@Autowired
	private StateRepository stateRepository;

	@Override
	public State addData(State state) {
		// TODO Auto-generated method stub
		return stateRepository.save(state);
	}

}
