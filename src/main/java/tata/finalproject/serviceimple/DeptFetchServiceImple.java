package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Dept;
import tata.finalproject.repository.DeptRepository;
import tata.finalproject.service.DeptFetchService;

@Service
public class DeptFetchServiceImple implements DeptFetchService {
	
	@Autowired
	private DeptRepository deptRepository;

	@Override
	public List<Dept> fetchData() {
		// TODO Auto-generated method stub
		return deptRepository.findAll();
	}

}
