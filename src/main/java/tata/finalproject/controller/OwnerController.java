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

import tata.finalproject.entity.Owner;
import tata.finalproject.serviceimple.OwnerAddServiceImple;
import tata.finalproject.serviceimple.OwnerDeleteServiceImple;
import tata.finalproject.serviceimple.OwnerFetchIdServiceImple;
import tata.finalproject.serviceimple.OwnerFetchServiceImple;
import tata.finalproject.serviceimple.OwnerUpdateServiceImple;


@RestController
@RequestMapping("/owner")
public class OwnerController {
	
	 @Autowired
	    private OwnerAddServiceImple ownerAddServiceImple;

	    @Autowired
	    private OwnerFetchIdServiceImple ownerFetchIdServiceImple;

	    @Autowired
	    private OwnerFetchServiceImple ownerFetchServiceImple;

	    @Autowired
	    private OwnerUpdateServiceImple ownerUpdateServiceImple;

	    @Autowired
	    private OwnerDeleteServiceImple ownerDeleteServiceImple;;

	    @GetMapping("/all")
	    public ResponseEntity<List<Owner>> allData() {

	        List<Owner> list = ownerFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Owner>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Owner> singleData(@PathVariable int id) {

	    	Owner owner = ownerFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Owner>(owner, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Owner> saveData(@RequestBody Owner owner) {

	    	Owner t1 = ownerAddServiceImple.addData(owner);

	        return new ResponseEntity<Owner>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Owner> updateData(@RequestBody Owner owner, @PathVariable int id) {

	    	Owner t1 = ownerUpdateServiceImple.updateData(owner,id);

	        return new ResponseEntity<Owner>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	ownerDeleteServiceImple.deleteData(id);
	        
	    }


}
