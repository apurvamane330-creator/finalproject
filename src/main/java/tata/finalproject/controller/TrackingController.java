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

import tata.finalproject.entity.Tracking;
import tata.finalproject.serviceimple.TrackingAddServiceImple;
import tata.finalproject.serviceimple.TrackingDeleteServiceImple;
import tata.finalproject.serviceimple.TrackingFetchIdServiceImple;
import tata.finalproject.serviceimple.TrackingFetchServiceImple;
import tata.finalproject.serviceimple.TrackingUpdateServiceImple;

@RestController
@RequestMapping("/tracking")
public class TrackingController {

    @Autowired
    private TrackingAddServiceImple trackingAddServiceImple;

    @Autowired
    private TrackingFetchIdServiceImple trackingFetchIdServiceImple;

    @Autowired
    private TrackingFetchServiceImple trackingFetchServiceImple;

    @Autowired
    private TrackingUpdateServiceImple trackingUpdateServiceImple;

    @Autowired
    private TrackingDeleteServiceImple trackingDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Tracking>> allData() {

        List<Tracking> list = trackingFetchServiceImple.fetchData();

        return new ResponseEntity<List<Tracking>>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Tracking> singleData(@PathVariable int id) {

        Tracking tracking = trackingFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<Tracking>(tracking, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Tracking> saveData(@RequestBody Tracking tracking) {

        Tracking t1 = trackingAddServiceImple.addData(tracking);

        return new ResponseEntity<Tracking>(t1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Tracking> updateData(@RequestBody Tracking tracking, @PathVariable int id) {

        Tracking t1 = trackingUpdateServiceImple.updateData(tracking, id);

        return new ResponseEntity<Tracking>(t1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        trackingDeleteServiceImple.deleteData(id);
    }
}