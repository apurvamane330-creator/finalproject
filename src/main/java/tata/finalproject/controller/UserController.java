package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.User;
import tata.finalproject.serviceimple.UserAddServiceImple;
import tata.finalproject.serviceimple.UserDeleteServiceImple;
import tata.finalproject.serviceimple.UserFetchIdServiceImple;
import tata.finalproject.serviceimple.UserFetchServiceImple;
import tata.finalproject.serviceimple.UserUpdateServiceImple;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserAddServiceImple userAddServiceImple;

    @Autowired
    private UserFetchIdServiceImple userFetchIdServiceImple;

    @Autowired
    private UserFetchServiceImple userFetchServiceImple;

    @Autowired
    private UserUpdateServiceImple userUpdateServiceImple;

    @Autowired
    private UserDeleteServiceImple userDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<User>> allData() {

        List<User> list = userFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<User> singleData(@PathVariable int id) {

        User user = userFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveData(@RequestBody User user) {

        User u1 = userAddServiceImple.addData(user);

        return new ResponseEntity<>(u1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateData(@RequestBody User user, @PathVariable int id) {

        User u1 = userUpdateServiceImple.updateData(user, id);

        return new ResponseEntity<>(u1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        userDeleteServiceImple.deleteData(id);
    }
}
