package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.EmployeeRepository;
import tata.finalproject.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImple implements EmployeeDeleteService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String deleteData(int id) {

        employeeRepository.deleteById(id);
        return "Employee Deleted Successfully";
    }
}