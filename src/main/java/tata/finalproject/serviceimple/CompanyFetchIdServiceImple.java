package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Company;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.service.CompanyFetchIdService;

@Service
public class CompanyFetchIdServiceImple implements CompanyFetchIdService{
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company fetchData(int id) {
		// TODO Auto-generated method stub
		return companyRepository.findById(id).orElse(null);
	}

}
