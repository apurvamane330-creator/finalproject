package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.TownRepository;
import tata.finalproject.service.TownDeleteService;

@Service
public class TownDeleteServiceImple implements TownDeleteService{

	@Autowired
	private TownRepository townRepository;

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub

		townRepository.deleteById(id);
		return "Town Deleted Successfully";

	}

}
