package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.service.AddressAddService;

@Service
public class AddressAddServiceImple implements AddressAddService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address addData(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}

}
