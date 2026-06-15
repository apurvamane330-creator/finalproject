package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Employee;
import tata.finalproject.serviceimple.EmployeeAddServiceImple;
import tata.finalproject.serviceimple.EmployeeDeleteServiceImple;
import tata.finalproject.serviceimple.EmployeeFetchIdServiceImple;
import tata.finalproject.serviceimple.EmployeeFetchServiceImple;
import tata.finalproject.serviceimple.EmployeeUpdateServiceImple;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeAddServiceImple employeeAddServiceImple;

    @Autowired
    private EmployeeFetchIdServiceImple employeeFetchIdServiceImple;

    @Autowired
    private EmployeeFetchServiceImple employeeFetchServiceImple;

    @Autowired
    private EmployeeUpdateServiceImple employeeUpdateServiceImple;

    @Autowired
    private EmployeeDeleteServiceImple employeeDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> allData() {

        List<Employee> list = employeeFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Employee> singleData(@PathVariable int id) {

        Employee employee = employeeFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee) {

        Employee e1 = employeeAddServiceImple.addData(employee);

        return new ResponseEntity<>(e1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateData(@RequestBody Employee employee,
                                               @PathVariable int id) {

        Employee e1 = employeeUpdateServiceImple.updateData(employee, id);

        return new ResponseEntity<>(e1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        employeeDeleteServiceImple.deleteData(id);
    }
}