package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.ShippingDetails;
import tata.finalproject.serviceimple.*;

@RestController
@RequestMapping("/shippingdetails")
public class ShippingDetailsController {

    @Autowired
    private ShippingDetailsAddServiceImple shippingDetailsAddServiceImple;

    @Autowired
    private ShippingDetailsFetchIdServiceImple shippingDetailsFetchIdServiceImple;

    @Autowired
    private ShippingDetailsFetchServiceImple shippingDetailsFetchServiceImple;

    @Autowired
    private ShippingDetailsUpdateServiceImple shippingDetailsUpdateServiceImple;

    @Autowired
    private ShippingDetailsDeleteServiceImple shippingDetailsDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<ShippingDetails>> allData() {
        return new ResponseEntity<>(
                shippingDetailsFetchServiceImple.fetchData(),
                HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<ShippingDetails> singleData(@PathVariable int id) {
        return new ResponseEntity<>(
                shippingDetailsFetchIdServiceImple.fetchData(id),
                HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ShippingDetails> saveData(
            @RequestBody ShippingDetails shippingDetails) {

        return new ResponseEntity<>(
                shippingDetailsAddServiceImple.addData(shippingDetails),
                HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ShippingDetails> updateData(
            @RequestBody ShippingDetails shippingDetails,
            @PathVariable int id) {

        return new ResponseEntity<>(
                shippingDetailsUpdateServiceImple.updateData(shippingDetails, id),
                HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {
        shippingDetailsDeleteServiceImple.deleteData(id);
    }
}