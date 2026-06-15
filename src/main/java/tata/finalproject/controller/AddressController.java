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

import tata.finalproject.entity.Address;
import tata.finalproject.serviceimple.AddressAddServiceImple;
import tata.finalproject.serviceimple.AddressDeleteServiceImple;
import tata.finalproject.serviceimple.AddressFetchIdServiceImple;
import tata.finalproject.serviceimple.AddressFetchServiceImple;
import tata.finalproject.serviceimple.AddressUpdateServiceImple;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	 @Autowired
	    private AddressAddServiceImple addressAddServiceImple;

	    @Autowired
	    private AddressFetchIdServiceImple addressFetchIdServiceImple;

	    @Autowired
	    private AddressFetchServiceImple addressFetchServiceImple;

	    @Autowired
	    private AddressUpdateServiceImple addressUpdateServiceImple;

	    @Autowired
	    private AddressDeleteServiceImple addressDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Address>> allData() {

	        List<Address> list = addressFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Address>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Address> singleData(@PathVariable int id) {

	    	Address address = addressFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Address>(address, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Address> saveData(@RequestBody Address address) {

	    	Address t1 = addressAddServiceImple.addData(address);

	        return new ResponseEntity<Address>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Address> updateData(@RequestBody Address address, @PathVariable int id) {

	    	Address t1 = addressUpdateServiceImple.updateData(address,id);

	        return new ResponseEntity<Address>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	addressDeleteServiceImple.deleteData(id);
	        
	    }


}
