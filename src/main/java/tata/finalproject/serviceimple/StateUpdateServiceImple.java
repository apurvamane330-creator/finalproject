package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.State;
import tata.finalproject.repository.StateRepository;
import tata.finalproject.service.StateUpdateService;

@Service
public class StateUpdateServiceImple implements StateUpdateService{
	
	@Autowired
	private StateRepository stateRepository;

	@Override
	public State updateData(State state, int id) {
		// TODO Auto-generated method stub
		return stateRepository.save(state);
	}

}
