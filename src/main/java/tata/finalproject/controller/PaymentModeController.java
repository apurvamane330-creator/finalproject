package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.PaymentMode;
import tata.finalproject.serviceimple.PaymentModeAddServiceImple;
import tata.finalproject.serviceimple.PaymentModeDeleteServiceImple;
import tata.finalproject.serviceimple.PaymentModeFetchIdServiceImple;
import tata.finalproject.serviceimple.PaymentModeFetchServiceImple;
import tata.finalproject.serviceimple.PaymentModeUpdateServiceImple;

@RestController
@RequestMapping("/paymentmode")
public class PaymentModeController {

    @Autowired
    private PaymentModeAddServiceImple paymentModeAddServiceImple;

    @Autowired
    private PaymentModeFetchIdServiceImple paymentModeFetchIdServiceImple;

    @Autowired
    private PaymentModeFetchServiceImple paymentModeFetchServiceImple;

    @Autowired
    private PaymentModeUpdateServiceImple paymentModeUpdateServiceImple;

    @Autowired
    private PaymentModeDeleteServiceImple paymentModeDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<PaymentMode>> allData() {

        List<PaymentMode> list = paymentModeFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<PaymentMode> singleData(@PathVariable int id) {

        PaymentMode paymentMode = paymentModeFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(paymentMode, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<PaymentMode> saveData(@RequestBody PaymentMode paymentMode) {

        PaymentMode p1 = paymentModeAddServiceImple.addData(paymentMode);

        return new ResponseEntity<>(p1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PaymentMode> updateData(@RequestBody PaymentMode paymentMode,
                                                  @PathVariable int id) {

        PaymentMode p1 = paymentModeUpdateServiceImple.updateData(paymentMode, id);

        return new ResponseEntity<>(p1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        paymentModeDeleteServiceImple.deleteData(id);
    }
}