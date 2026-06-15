package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.entity.Company;
import tata.finalproject.entity.Owner;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.repository.OwnerRepository;
import tata.finalproject.service.OwnerUpdateService;

@Service
public class OwnerUpdateServiceImple implements OwnerUpdateService{

	@Autowired
	private OwnerRepository ownerRepository;


	@Override
	public Owner updateData(Owner owner, int id) {
		
		return ownerRepository.save(owner);
	}

}
