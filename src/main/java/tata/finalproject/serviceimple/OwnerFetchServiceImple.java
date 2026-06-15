package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Owner;
import tata.finalproject.repository.OwnerRepository;
import tata.finalproject.service.OwnerFetchService;

@Service
public class OwnerFetchServiceImple implements OwnerFetchService{

	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public List<Owner> fetchData() {
		// TODO Auto-generated method stub

		return ownerRepository.findAll();
	}



}
