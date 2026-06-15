package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.OwnerRepository;
import tata.finalproject.service.OwnerDeleteService;

@Service
public class OwnerDeleteServiceImple implements OwnerDeleteService{
	
	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public String deleteData(int id) {
		
		ownerRepository.deleteById(id);
		return "Town Deleted Successfully";
		
	}

	
}
