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

import tata.finalproject.entity.Category;
import tata.finalproject.serviceimple.CategoryAddServiceImple;
import tata.finalproject.serviceimple.CategoryDeleteServiceImple;
import tata.finalproject.serviceimple.CategoryFetchIdServiceImple;
import tata.finalproject.serviceimple.CategoryFetchServiceImple;
import tata.finalproject.serviceimple.CategoryUpdateServiceImple;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	 @Autowired
	    private CategoryAddServiceImple categoryAddServiceImple;

	    @Autowired
	    private CategoryFetchIdServiceImple categoryFetchIdServiceImple;

	    @Autowired
	    private CategoryFetchServiceImple categoryFetchServiceImple;

	    @Autowired
	    private CategoryUpdateServiceImple categoryUpdateServiceImple;

	    @Autowired
	    private CategoryDeleteServiceImple categoryDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Category>> allData() {

	        List<Category> list = categoryFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Category>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Category> singleData(@PathVariable int id) {

	    	Category category = categoryFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Category>(category, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Category> saveData(@RequestBody Category category) {

	    	Category t1 = categoryAddServiceImple.addData(category);

	        return new ResponseEntity<Category>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Category> updateData(@RequestBody Category category, @PathVariable int id) {

	    	Category t1 = categoryUpdateServiceImple.updateData(category,id);

	        return new ResponseEntity<Category>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	categoryDeleteServiceImple.deleteData(id);
	        
	    }


}
