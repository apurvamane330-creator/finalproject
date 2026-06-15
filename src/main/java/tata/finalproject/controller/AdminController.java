package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Admin;
import tata.finalproject.serviceimple.AdminAddServiceImple;
import tata.finalproject.serviceimple.AdminDeleteServiceImple;
import tata.finalproject.serviceimple.AdminFetchIdServiceImple;
import tata.finalproject.serviceimple.AdminFetchServiceImple;
import tata.finalproject.serviceimple.AdminUpdateServiceImple;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminAddServiceImple adminAddServiceImple;

    @Autowired
    private AdminFetchIdServiceImple adminFetchIdServiceImple;

    @Autowired
    private AdminFetchServiceImple adminFetchServiceImple;

    @Autowired
    private AdminUpdateServiceImple adminUpdateServiceImple;

    @Autowired
    private AdminDeleteServiceImple adminDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Admin>> allData() {

        List<Admin> list = adminFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Admin> singleData(@PathVariable int id) {

        Admin admin = adminFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Admin> saveData(@RequestBody Admin admin) {

        Admin a1 = adminAddServiceImple.addData(admin);

        return new ResponseEntity<>(a1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Admin> updateData(@RequestBody Admin admin, @PathVariable int id) {

        Admin a1 = adminUpdateServiceImple.updateData(admin, id);

        return new ResponseEntity<>(a1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        adminDeleteServiceImple.deleteData(id);
    }
}