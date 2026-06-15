package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Dept;
import tata.finalproject.repository.DeptRepository;
import tata.finalproject.service.DeptFetchIdService;

@Service
public class DeptFetchIdServiceImple implements DeptFetchIdService{
	
	@Autowired
	private DeptRepository deptRepository;

	@Override
	public Dept fetchData(int id) {
		// TODO Auto-generated method stub
		return deptRepository.findById(id).orElse(null);
	}

}
