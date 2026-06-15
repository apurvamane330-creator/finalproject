package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Employee;
import tata.finalproject.repository.EmployeeRepository;
import tata.finalproject.service.EmployeeFetchIdService;

@Service
public class EmployeeFetchIdServiceImple implements EmployeeFetchIdService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee fetchData(int id) {

        return employeeRepository.findById(id).orElse(null);
    }
}