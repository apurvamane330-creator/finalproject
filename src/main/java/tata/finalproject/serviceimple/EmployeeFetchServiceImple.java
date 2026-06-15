package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Employee;
import tata.finalproject.repository.EmployeeRepository;
import tata.finalproject.service.EmployeeFetchService;

@Service
public class EmployeeFetchServiceImple implements EmployeeFetchService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> fetchData() {

        return employeeRepository.findAll();
    }
}