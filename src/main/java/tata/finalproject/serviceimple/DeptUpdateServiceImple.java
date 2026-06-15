package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Company;
import tata.finalproject.entity.Dept;
import tata.finalproject.repository.CompanyRepository;
import tata.finalproject.repository.DeptRepository;
import tata.finalproject.service.DeptUpdateService;

@Service
public class DeptUpdateServiceImple implements DeptUpdateService{
	
	@Autowired
	private DeptRepository deptRepository;
	

	@Override
	public Dept updateData(Dept dept, int id) {
		
		return deptRepository.save(dept);
	}

}
