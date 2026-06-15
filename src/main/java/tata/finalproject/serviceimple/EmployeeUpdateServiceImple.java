package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Employee;
import tata.finalproject.repository.EmployeeRepository;
import tata.finalproject.service.EmployeeUpdateService;

@Service
public class EmployeeUpdateServiceImple implements EmployeeUpdateService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee updateData(Employee employee, int id) {

        return employeeRepository.save(employee);
    }
}