package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Cod;
import tata.finalproject.serviceimple.CodAddServiceImple;
import tata.finalproject.serviceimple.CodDeleteServiceImple;
import tata.finalproject.serviceimple.CodFetchIdServiceImple;
import tata.finalproject.serviceimple.CodFetchServiceImple;
import tata.finalproject.serviceimple.CodUpdateServiceImple;

@RestController
@RequestMapping("/cod")
public class CodController {

    @Autowired
    private CodAddServiceImple codAddServiceImple;

    @Autowired
    private CodFetchIdServiceImple codFetchIdServiceImple;

    @Autowired
    private CodFetchServiceImple codFetchServiceImple;

    @Autowired
    private CodUpdateServiceImple codUpdateServiceImple;

    @Autowired
    private CodDeleteServiceImple codDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Cod>> allData() {

        List<Cod> list = codFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Cod> singleData(@PathVariable int id) {

        Cod cod = codFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(cod, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Cod> saveData(@RequestBody Cod cod) {

        Cod c1 = codAddServiceImple.addData(cod);

        return new ResponseEntity<>(c1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Cod> updateData(@RequestBody Cod cod, @PathVariable int id) {

        Cod c1 = codUpdateServiceImple.updateData(cod, id);

        return new ResponseEntity<>(c1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        codDeleteServiceImple.deleteData(id);
    }
}