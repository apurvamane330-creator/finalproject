package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.DeptRepository;
import tata.finalproject.service.DeptDeleteService;

@Service
public class DeptDeleteServiceImple implements DeptDeleteService{
	
	@Autowired
	private DeptRepository deptRepository;

	@Override
	public String deleteData(int id) {

		deptRepository.deleteById(id);
		return "Town Deleted Successfully";
	}

}
