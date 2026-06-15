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

import tata.finalproject.entity.Dept;
import tata.finalproject.serviceimple.DeptAddServiceImple;
import tata.finalproject.serviceimple.DeptDeleteServiceImple;
import tata.finalproject.serviceimple.DeptFetchIdServiceImple;
import tata.finalproject.serviceimple.DeptFetchServiceImple;
import tata.finalproject.serviceimple.DeptUpdateServiceImple;


@RestController
@RequestMapping("/dept")
public class DeptController {
	
	 @Autowired
	    private DeptAddServiceImple deptAddServiceImple;

	    @Autowired
	    private DeptFetchIdServiceImple deptFetchIdServiceImple;

	    @Autowired
	    private DeptFetchServiceImple deptFetchServiceImple;

	    @Autowired
	    private DeptUpdateServiceImple deptUpdateServiceImple;

	    @Autowired
	    private DeptDeleteServiceImple deptDeleteServiceImple;

	    @GetMapping("/all")
	    public ResponseEntity<List<Dept>> allData() {

	        List<Dept> list = deptFetchServiceImple.fetchData();

	        return new ResponseEntity<List<Dept>>(list, HttpStatus.OK);
	    }

	    @GetMapping("/single/{id}")
	    public ResponseEntity<Dept> singleData(@PathVariable int id) {

	    	Dept dept = deptFetchIdServiceImple.fetchData(id);

	        return new ResponseEntity<Dept>(dept, HttpStatus.OK);
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Dept> saveData(@RequestBody Dept dept) {

	    	Dept t1 = deptAddServiceImple.addData(dept);

	        return new ResponseEntity<Dept>(t1, HttpStatus.CREATED);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Dept> updateData(@RequestBody Dept dept, @PathVariable int id) {

	    	Dept t1 = deptUpdateServiceImple.updateData(dept,id);

	        return new ResponseEntity<Dept>(t1, HttpStatus.OK);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteData(@PathVariable int id) {

	    	deptDeleteServiceImple.deleteData(id);
	        
	    }


}
