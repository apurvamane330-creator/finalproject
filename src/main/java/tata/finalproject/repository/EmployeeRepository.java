package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
