package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.State;
import tata.finalproject.repository.StateRepository;
import tata.finalproject.service.StateFetchService;

@Service
public class StateFetchServiceImple implements StateFetchService {
	
	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<State> fetchData() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();
	}

}
