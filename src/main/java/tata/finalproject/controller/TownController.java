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

import tata.finalproject.entity.Town;
import tata.finalproject.serviceimple.TownAddServiceImple;
import tata.finalproject.serviceimple.TownDeleteServiceImple;
import tata.finalproject.serviceimple.TownFetchIdServiceImple;
import tata.finalproject.serviceimple.TownFetchServiceImple;
import tata.finalproject.serviceimple.TownUpdateServiceImple;

@RestController
@RequestMapping("/town")
public class TownController {
	
    @Autowired
    private TownAddServiceImple townAddServiceImple;

    @Autowired
    private TownFetchIdServiceImple townFetchIdServiceImple;

    @Autowired
    private TownFetchServiceImple townFetchServiceImple;

    @Autowired
    private TownUpdateServiceImple townUpdateServiceImple;

    @Autowired
    private TownDeleteServiceImple townDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Town>> allData() {

        List<Town> list = townFetchServiceImple.fetchData();

        return new ResponseEntity<List<Town>>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Town> singleData(@PathVariable int id) {

        Town town = townFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<Town>(town, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Town> saveData(@RequestBody Town town) {

        Town t1 = townAddServiceImple.addData(town);

        return new ResponseEntity<Town>(t1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Town> updateData(@RequestBody Town town, @PathVariable int id) {

        Town t1 = townUpdateServiceImple.updateData(town,id);

        return new ResponseEntity<Town>(t1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        townDeleteServiceImple.deleteData(id);
        
    }

}
