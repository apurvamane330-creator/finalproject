package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.entity.Company;
import tata.finalproject.entity.Owner;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.repository.OwnerRepository;
import tata.finalproject.service.OwnerAddService;

@Service
public class OwnerAddServiceImple implements OwnerAddService{
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Owner addData(Owner owner) {
		// TODO Auto-generated method stub

        Company company =
        		companyRepository.findById(
                        owner.getCompany().getRegNo())
                        .orElseThrow();

        Address address =
        		addressRepository.findById(
                        owner.getAddress().getFlatno())
                        .orElseThrow();

        owner.setCompany(company);
        owner.setAddress(address);

        return ownerRepository.save(owner);
	}

}
