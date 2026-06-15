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

import tata.finalproject.entity.Distric;
import tata.finalproject.serviceimple.DistricAddServiceImple;
import tata.finalproject.serviceimple.DistricDeleteServiceImple;
import tata.finalproject.serviceimple.DistricFetchIdServiceImple;
import tata.finalproject.serviceimple.DistricFetchServiceImple;
import tata.finalproject.serviceimple.DistricUpdateServiceImple;

@RestController
@RequestMapping("/distric")
public class DistricController {
	
	 @Autowired
	    private DistricAddServiceImple districAddServiceImple;

	    @Autowired
	    private DistricFetchIdServiceImple districFetchIdServiceImple;

	    @Autowired
	    private DistricFetchServiceImple districFetchServiceImple;

	    @Autowired
	    private DistricUpdateServiceImple districUpdateServiceImple;

	    @Autowired
	    private DistricDeleteServiceImple districDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Distric>> allData() {

	        List<Distric> list = districFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Distric>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Distric> singleData(@PathVariable int id) {

	    	Distric distric = districFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Distric>(distric, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Distric> saveData(@RequestBody Distric distric) {

	    	Distric t1 = districAddServiceImple.addData(distric);

	        return new ResponseEntity<Distric>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Distric> updateData(@RequestBody Distric distric, @PathVariable int id) {

	    	Distric t1 = districUpdateServiceImple.updateData(distric,id);

	        return new ResponseEntity<Distric>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	districDeleteServiceImple.deleteData(id);
	        
	    }

}
