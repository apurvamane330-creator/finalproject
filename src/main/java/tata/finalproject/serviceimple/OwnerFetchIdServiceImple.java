package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Owner;
import tata.finalproject.repository.OwnerRepository;
import tata.finalproject.service.OwnerFetchIdService;

@Service
public class OwnerFetchIdServiceImple implements OwnerFetchIdService{
	
	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public Owner fetchData(int id) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(id).orElse(null);
	}

}
