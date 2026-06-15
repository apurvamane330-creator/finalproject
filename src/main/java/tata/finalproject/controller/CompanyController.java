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

import tata.finalproject.entity.Company;
import tata.finalproject.serviceimple.CompanyAddServiceImple;
import tata.finalproject.serviceimple.CompanyDeleteServiceImple;
import tata.finalproject.serviceimple.CompanyFetchIdServiceImple;
import tata.finalproject.serviceimple.CompanyFetchServiceImple;
import tata.finalproject.serviceimple.CompanyUpdateServiceImple;

@RestController
@RequestMapping("/company")
public class CompanyController {

	 @Autowired
	    private CompanyAddServiceImple companyAddServiceImple;

	    @Autowired
	    private CompanyFetchIdServiceImple companyFetchIdServiceImple;

	    @Autowired
	    private CompanyFetchServiceImple companyFetchServiceImple;

	    @Autowired
	    private CompanyUpdateServiceImple companyUpdateServiceImple;

	    @Autowired
	    private CompanyDeleteServiceImple companyDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Company>> allData() {

	        List<Company> list = companyFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Company> singleData(@PathVariable int id) {

	    	Company company = companyFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Company>(company, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Company> saveData(@RequestBody Company company) {

	    	Company t1 = companyAddServiceImple.addData(company);

	        return new ResponseEntity<Company>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Company> updateData(@RequestBody Company company, @PathVariable int id) {

	    	Company t1 = companyUpdateServiceImple.updateData(company,id);

	        return new ResponseEntity<Company>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	companyDeleteServiceImple.deleteData(id);
	        
	    }

}
