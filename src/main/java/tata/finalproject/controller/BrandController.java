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

import tata.finalproject.entity.Brand;
import tata.finalproject.serviceimple.BrandAddServiceImple;
import tata.finalproject.serviceimple.BrandDeleteServiceImple;
import tata.finalproject.serviceimple.BrandFetchIdServiceImple;
import tata.finalproject.serviceimple.BrandFetchServiceImple;
import tata.finalproject.serviceimple.BrandUpdateServiceImple;


@RestController
@RequestMapping("/brand")
public class BrandController {
	

	 @Autowired
	    private BrandAddServiceImple brandAddServiceImple;

	    @Autowired
	    private BrandFetchIdServiceImple brandFetchIdServiceImple;

	    @Autowired
	    private BrandFetchServiceImple brandFetchServiceImple;

	    @Autowired
	    private BrandUpdateServiceImple brandUpdateServiceImple;

	    @Autowired
	    private BrandDeleteServiceImple brandDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Brand>> allData() {

	        List<Brand> list = brandFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Brand>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Brand> singleData(@PathVariable int id) {

	    	Brand brand = brandFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Brand>(brand, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Brand> saveData(@RequestBody Brand brand) {

	    	Brand t1 = brandAddServiceImple.addData(brand);

	        return new ResponseEntity<Brand>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Brand> updateData(@RequestBody Brand brand, @PathVariable int id) {

	    	Brand t1 = brandUpdateServiceImple.updateData(brand,id);

	        return new ResponseEntity<Brand>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	brandDeleteServiceImple.deleteData(id);
	        
	    }



}
