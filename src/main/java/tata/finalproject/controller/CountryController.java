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

import tata.finalproject.entity.Country;
import tata.finalproject.serviceimple.CountryAddServiceImple;
import tata.finalproject.serviceimple.CountryDeleteServiceImple;
import tata.finalproject.serviceimple.CountryFetchIdServiceImple;
import tata.finalproject.serviceimple.CountryFetchServiceImple;
import tata.finalproject.serviceimple.CountryUpdateServiceImple;


@RestController
@RequestMapping("/country")
public class CountryController {
	
	 @Autowired
	    private CountryAddServiceImple countryAddServiceImple;

	    @Autowired
	    private CountryFetchIdServiceImple countryFetchIdServiceImple;

	    @Autowired
	    private CountryFetchServiceImple countryFetchServiceImple;

	    @Autowired
	    private CountryUpdateServiceImple countryUpdateServiceImple;

	    @Autowired
	    private CountryDeleteServiceImple countryDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Country>> allData() {

	        List<Country> list = countryFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Country>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Country> singleData(@PathVariable int id) {

	    	Country country = countryFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Country>(country, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Country> saveData(@RequestBody Country country) {

	    	Country t1 = countryAddServiceImple.addData(country);

	        return new ResponseEntity<Country>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Country> updateData(@RequestBody Country country, @PathVariable int id) {

	    	Country t1 = countryUpdateServiceImple.updateData(country,id);

	        return new ResponseEntity<Country>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	countryDeleteServiceImple.deleteData(id);
	        
	    }

}
