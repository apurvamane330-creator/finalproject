package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.entity.Company;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.service.CompanyAddService;

@Service
public class CompanyAddServiceImple implements CompanyAddService{
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Company addData(Company company) {
	    Integer flatno = company.getAddress().getFlatno();

	    Address address =
	    		addressRepository.findById(flatno)
	                       .orElseThrow();

	    company.setAddress(address);

	    return companyRepository.save(company);
	}

}
