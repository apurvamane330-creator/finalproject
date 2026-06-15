package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.AddressRepository;
import tata.finalproject.service.AddressDeleteService;

@Service
public class AddressDeleteServiceImple implements AddressDeleteService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub
		addressRepository.deleteById(id);
		return "Town Deleted Successfully";
	}

}
