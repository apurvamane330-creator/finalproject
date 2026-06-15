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

import tata.finalproject.entity.State;
import tata.finalproject.serviceimple.StateAddServiceImple;
import tata.finalproject.serviceimple.StateDeleteServiceImple;
import tata.finalproject.serviceimple.StateFetchIdServiceImple;
import tata.finalproject.serviceimple.StateFetchServiceImple;
import tata.finalproject.serviceimple.StateUpdateServiceImple;



@RestController
@RequestMapping("/state")
public class StateController {
	
    @Autowired
    private StateAddServiceImple stateAddServiceImple;

    @Autowired
    private StateFetchIdServiceImple stateFetchIdServiceImple;

    @Autowired
    private StateFetchServiceImple stateFetchServiceImple;

    @Autowired
    private StateUpdateServiceImple stateUpdateServiceImple;

    @Autowired
    private StateDeleteServiceImple stateDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<State>> allData() {

        List<State> list = stateFetchServiceImple.fetchData();

        return new ResponseEntity<List<State>>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<State> singleData(@PathVariable int id) {

    	State state = stateFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<State>(state, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<State> saveData(@RequestBody State state) {

    	State t1 = stateAddServiceImple.addData(state);

        return new ResponseEntity<State>(t1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<State> updateData(@RequestBody State state, @PathVariable int id) {

    	State t1 = stateUpdateServiceImple.updateData(state,id);

        return new ResponseEntity<State>(t1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

    	stateDeleteServiceImple.deleteData(id);
        
    }

}
