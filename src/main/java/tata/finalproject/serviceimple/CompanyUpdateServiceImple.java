package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Address;
import tata.finalproject.entity.Company;
import tata.finalproject.repository.AddressRepository;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.service.CompanyUpdateService;

@Service
public class CompanyUpdateServiceImple implements CompanyUpdateService{
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company updateData(Company company, int id) {
		
	
		return companyRepository.save(company);
		
	}

}
