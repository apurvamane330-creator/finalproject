package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.service.CompanyDeleteService;

@Service
public class CompanyDeleteServiceImple implements CompanyDeleteService{
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub
		companyRepository.deleteById(id);
		return "Company Deleted Successfully";
	}

}
