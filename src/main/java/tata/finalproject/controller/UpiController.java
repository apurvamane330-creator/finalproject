package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Upi;
import tata.finalproject.serviceimple.UpiAddServiceImple;
import tata.finalproject.serviceimple.UpiDeleteServiceImple;
import tata.finalproject.serviceimple.UpiFetchIdServiceImple;
import tata.finalproject.serviceimple.UpiFetchServiceImple;
import tata.finalproject.serviceimple.UpiUpdateServiceImple;

@RestController
@RequestMapping("/upi")
public class UpiController {

    @Autowired
    private UpiAddServiceImple upiAddServiceImple;

    @Autowired
    private UpiFetchIdServiceImple upiFetchIdServiceImple;

    @Autowired
    private UpiFetchServiceImple upiFetchServiceImple;

    @Autowired
    private UpiUpdateServiceImple upiUpdateServiceImple;

    @Autowired
    private UpiDeleteServiceImple upiDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Upi>> allData() {

        List<Upi> list = upiFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Upi> singleData(@PathVariable int id) {

        Upi upi = upiFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(upi, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Upi> saveData(@RequestBody Upi upi) {

        Upi u1 = upiAddServiceImple.addData(upi);

        return new ResponseEntity<>(u1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Upi> updateData(@RequestBody Upi upi, @PathVariable int id) {

        Upi u1 = upiUpdateServiceImple.updateData(upi, id);

        return new ResponseEntity<>(u1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        upiDeleteServiceImple.deleteData(id);
    }
}