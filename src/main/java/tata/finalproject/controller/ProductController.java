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

import tata.finalproject.entity.Product;
import tata.finalproject.serviceimple.ProductAddServiceImple;
import tata.finalproject.serviceimple.ProductDeleteServiceImple;
import tata.finalproject.serviceimple.ProductFetchIdServiceImple;
import tata.finalproject.serviceimple.ProductFetchServiceImple;
import tata.finalproject.serviceimple.ProductUpdateServiceImple;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	 @Autowired
	    private ProductAddServiceImple productAddServiceImple;

	    @Autowired
	    private ProductFetchIdServiceImple productFetchIdServiceImple;

	    @Autowired
	    private ProductFetchServiceImple productFetchServiceImple;

	    @Autowired
	    private ProductUpdateServiceImple productUpdateServiceImple;

	    @Autowired
	    private ProductDeleteServiceImple productDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Product>> allData() {

	        List<Product> list = productFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Product> singleData(@PathVariable int id) {

	    	Product product = productFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Product>(product, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Product> saveData(@RequestBody Product product) {

	    	Product t1 = productAddServiceImple.addData(product);

	        return new ResponseEntity<Product>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Product> updateData(@RequestBody Product product, @PathVariable int id) {

	    	Product t1 = productUpdateServiceImple.updateData(product,id);

	        return new ResponseEntity<Product>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	productDeleteServiceImple.deleteData(id);
	        
	    }


}
