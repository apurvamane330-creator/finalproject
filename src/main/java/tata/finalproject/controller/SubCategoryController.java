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

import tata.finalproject.entity.SubCategory;
import tata.finalproject.serviceimple.SubCategoryAddServiceImple;
import tata.finalproject.serviceimple.SubCategoryDeleteServiceImple;
import tata.finalproject.serviceimple.SubCategoryFetchIdServiceImple;
import tata.finalproject.serviceimple.SubCategoryFetchServiceImple;
import tata.finalproject.serviceimple.SubCategoryUpdateServiceImple;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {
	

	 @Autowired
	    private SubCategoryAddServiceImple subCategoryAddServiceImple;

	    @Autowired
	    private SubCategoryFetchIdServiceImple subCategoryFetchIdServiceImple;

	    @Autowired
	    private SubCategoryFetchServiceImple subCategoryFetchServiceImple;

	    @Autowired
	    private SubCategoryUpdateServiceImple subCategoryUpdateServiceImple;

	    @Autowired
	    private SubCategoryDeleteServiceImple subCategoryDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<SubCategory>> allData() {

	        List<SubCategory> list = subCategoryFetchServiceImple.fetchData();

	        return new ResponseEntity<List<SubCategory>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<SubCategory> singleData(@PathVariable int id) {

	    	SubCategory subCategory = subCategoryFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<SubCategory>(subCategory, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<SubCategory> saveData(@RequestBody SubCategory subCategory) {

	    	SubCategory t1 = subCategoryAddServiceImple.addData(subCategory);

	        return new ResponseEntity<SubCategory>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<SubCategory> updateData(@RequestBody SubCategory subCategory, @PathVariable int id) {

	    	SubCategory t1 = subCategoryUpdateServiceImple.updateData(subCategory,id);

	        return new ResponseEntity<SubCategory>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	subCategoryDeleteServiceImple.deleteData(id);
	        
	    }



}
