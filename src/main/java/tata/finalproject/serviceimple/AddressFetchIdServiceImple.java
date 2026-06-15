package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.service.AddressFetchIdService;

@Service
public class AddressFetchIdServiceImple implements AddressFetchIdService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address fetchData(int id) {
		// TODO Auto-generated method stub
		return addressRepository.findById(id).orElse(null);
	}

}
