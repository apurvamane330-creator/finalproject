package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.StateRepository;
import tata.finalproject.service.StateDeleteService;

@Service
public class StateDeleteServiceImple implements StateDeleteService{
	
	@Autowired 
	private StateRepository stateRepository;

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub
		stateRepository.deleteById(id);
		return "Town Deleted Successfully";
	}

}
