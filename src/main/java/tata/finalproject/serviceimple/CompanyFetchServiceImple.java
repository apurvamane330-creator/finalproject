package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Company;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.service.CompanyFetchService;

@Service
public class CompanyFetchServiceImple implements CompanyFetchService{
	
	@Autowired
	private CompanyRepository companyRepository;


	@Override
	public List<Company> fetchData() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}

}
