package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.CustomerQuery;
import tata.finalproject.serviceimple.CustomerQueryAddServiceImple;
import tata.finalproject.serviceimple.CustomerQueryDeleteServiceImple;
import tata.finalproject.serviceimple.CustomerQueryFetchIdServiceImple;
import tata.finalproject.serviceimple.CustomerQueryFetchServiceImple;
import tata.finalproject.serviceimple.CustomerQueryUpdateServiceImple;

@RestController
@RequestMapping("/customerquery")
public class CustomerQueryController {

    @Autowired
    private CustomerQueryAddServiceImple customerQueryAddServiceImple;

    @Autowired
    private CustomerQueryFetchIdServiceImple customerQueryFetchIdServiceImple;

    @Autowired
    private CustomerQueryFetchServiceImple customerQueryFetchServiceImple;

    @Autowired
    private CustomerQueryUpdateServiceImple customerQueryUpdateServiceImple;

    @Autowired
    private CustomerQueryDeleteServiceImple customerQueryDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<CustomerQuery>> allData() {

        List<CustomerQuery> list = customerQueryFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<CustomerQuery> singleData(@PathVariable int id) {

        CustomerQuery customerQuery = customerQueryFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(customerQuery, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<CustomerQuery> saveData(@RequestBody CustomerQuery customerQuery) {

        CustomerQuery c1 = customerQueryAddServiceImple.addData(customerQuery);

        return new ResponseEntity<>(c1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CustomerQuery> updateData(@RequestBody CustomerQuery customerQuery,
                                                    @PathVariable int id) {

        CustomerQuery c1 = customerQueryUpdateServiceImple.updateData(customerQuery, id);

        return new ResponseEntity<>(c1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        customerQueryDeleteServiceImple.deleteData(id);
    }
}