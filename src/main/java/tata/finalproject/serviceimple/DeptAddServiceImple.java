package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Company;
import tata.finalproject.entity.Dept;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.repository.DeptRepository;
import tata.finalproject.service.DeptAddService;

@Service
public class DeptAddServiceImple implements DeptAddService{
	
	@Autowired
	private DeptRepository deptRepository;
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Dept addData(Dept dept) {
		Company company =
				companyRepository.findById(
		            dept.getCompany().getRegNo())
		            .orElseThrow();

		    dept.setCompany(company);

		    return deptRepository.save(dept);
	}

}
