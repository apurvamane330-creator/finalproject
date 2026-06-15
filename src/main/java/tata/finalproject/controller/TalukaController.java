package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tata.finalproject.entity.Taluka;
import tata.finalproject.serviceimple.TalukaAddServiceImple;
import tata.finalproject.serviceimple.TalukaDeleteServiceImple;
import tata.finalproject.serviceimple.TalukaFetchIdServiceImple;
import tata.finalproject.serviceimple.TalukaFetchServiceImple;
import tata.finalproject.serviceimple.TalukaUpdateServiceImple;


@RestController
@RequestMapping("/taluka")
public class TalukaController {
	
    @Autowired
    private TalukaAddServiceImple talukaAddServiceImple;

    @Autowired
    private TalukaFetchIdServiceImple talukaFetchIdServiceImple;

    @Autowired
    private TalukaFetchServiceImple talukaFetchServiceImple;

    @Autowired
    private TalukaUpdateServiceImple talukaUpdateServiceImple;

    @Autowired
    private TalukaDeleteServiceImple talukaDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Taluka>> allData() {

        List<Taluka> list = talukaFetchServiceImple.fetchData();

        return new ResponseEntity<List<Taluka>>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Taluka> singleData(@PathVariable int id) {

    	Taluka taluka = talukaFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<Taluka>(taluka, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Taluka> saveData(@RequestBody Taluka taluka) {

    	Taluka t1 = talukaAddServiceImple.addData(taluka);

        return new ResponseEntity<Taluka>(t1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Taluka> updateData(@RequestBody Taluka taluka, @PathVariable int id) {

    	Taluka t1 = talukaUpdateServiceImple.updateData(taluka,id);

        return new ResponseEntity<Taluka>(t1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

    	talukaDeleteServiceImple.deleteData(id);
        
    }

}
