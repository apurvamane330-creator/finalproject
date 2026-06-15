package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.service.AddressFetchService;

@Service
public class AddressFetchServiceImple implements AddressFetchService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> fetchData() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

}
