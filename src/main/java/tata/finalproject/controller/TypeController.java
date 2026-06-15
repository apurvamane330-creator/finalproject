package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Type;
import tata.finalproject.serviceimple.TypeAddServiceImple;
import tata.finalproject.serviceimple.TypeDeleteServiceImple;
import tata.finalproject.serviceimple.TypeFetchIdServiceImple;
import tata.finalproject.serviceimple.TypeFetchServiceImple;
import tata.finalproject.serviceimple.TypeUpdateServiceImple;

@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeAddServiceImple typeAddServiceImple;

    @Autowired
    private TypeFetchIdServiceImple typeFetchIdServiceImple;

    @Autowired
    private TypeFetchServiceImple typeFetchServiceImple;

    @Autowired
    private TypeUpdateServiceImple typeUpdateServiceImple;

    @Autowired
    private TypeDeleteServiceImple typeDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Type>> allData() {

        List<Type> list = typeFetchServiceImple.fetchData();

        return new ResponseEntity<List<Type>>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Type> singleData(@PathVariable int id) {

        Type type = typeFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<Type>(type, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Type> saveData(@RequestBody Type type) {

        Type t1 = typeAddServiceImple.addData(type);

        return new ResponseEntity<Type>(t1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Type> updateData(@RequestBody Type type, @PathVariable int id) {

        Type t1 = typeUpdateServiceImple.updateData(type, id);

        return new ResponseEntity<Type>(t1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        typeDeleteServiceImple.deleteData(id);
    }
}
