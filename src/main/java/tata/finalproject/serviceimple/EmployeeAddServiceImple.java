package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Employee;
import tata.finalproject.repository.EmployeeRepository;
import tata.finalproject.service.EmployeeAddService;

@Service
public class EmployeeAddServiceImple implements EmployeeAddService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addData(Employee employee) {
        return employeeRepository.save(employee);
    }
}