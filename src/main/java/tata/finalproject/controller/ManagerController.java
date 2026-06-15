package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Manager;
import tata.finalproject.serviceimple.ManagerAddServiceImple;
import tata.finalproject.serviceimple.ManagerDeleteServiceImple;
import tata.finalproject.serviceimple.ManagerFetchIdServiceImple;
import tata.finalproject.serviceimple.ManagerFetchServiceImple;
import tata.finalproject.serviceimple.ManagerUpdateServiceImple;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerAddServiceImple managerAddServiceImple;

    @Autowired
    private ManagerFetchIdServiceImple managerFetchIdServiceImple;

    @Autowired
    private ManagerFetchServiceImple managerFetchServiceImple;

    @Autowired
    private ManagerUpdateServiceImple managerUpdateServiceImple;

    @Autowired
    private ManagerDeleteServiceImple managerDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Manager>> allData() {

        List<Manager> list = managerFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Manager> singleData(@PathVariable int id) {

        Manager manager = managerFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(manager, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Manager> saveData(@RequestBody Manager manager) {

        Manager m1 = managerAddServiceImple.addData(manager);

        return new ResponseEntity<>(m1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Manager> updateData(@RequestBody Manager manager,
                                              @PathVariable int id) {

        Manager m1 = managerUpdateServiceImple.updateData(manager, id);

        return new ResponseEntity<>(m1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        managerDeleteServiceImple.deleteData(id);
    }
}