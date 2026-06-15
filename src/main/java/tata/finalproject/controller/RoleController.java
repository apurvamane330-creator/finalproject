package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Role;
import tata.finalproject.serviceimple.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleAddServiceImple roleAddServiceImple;

    @Autowired
    private RoleFetchIdServiceImple roleFetchIdServiceImple;

    @Autowired
    private RoleFetchServiceImple roleFetchServiceImple;

    @Autowired
    private RoleUpdateServiceImple roleUpdateServiceImple;

    @Autowired
    private RoleDeleteServiceImple roleDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Role>> allData() {
        return new ResponseEntity<>(
                roleFetchServiceImple.fetchData(),
                HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Role> singleData(@PathVariable int id) {
        return new ResponseEntity<>(
                roleFetchIdServiceImple.fetchData(id),
                HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Role> saveData(
            @RequestBody Role role) {

        return new ResponseEntity<>(
                roleAddServiceImple.addData(role),
                HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Role> updateData(
            @RequestBody Role role,
            @PathVariable int id) {

        return new ResponseEntity<>(
                roleUpdateServiceImple.updateData(role, id),
                HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {
        roleDeleteServiceImple.deleteData(id);
    }
}