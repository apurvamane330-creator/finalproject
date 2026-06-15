package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.service.AddressUpdateService;

@Service
public class AddressUpdateServiceImple implements AddressUpdateService{
	
	@Autowired 
	private AddressRepository addressRepository;

	@Override
	public Address updateData(Address address, int id) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

}
