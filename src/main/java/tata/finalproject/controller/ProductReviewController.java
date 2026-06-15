package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.ProductReview;
import tata.finalproject.serviceimple.*;

@RestController
@RequestMapping("/productreview")
public class ProductReviewController {

    @Autowired
    private ProductReviewAddServiceImple productReviewAddServiceImple;

    @Autowired
    private ProductReviewFetchIdServiceImple productReviewFetchIdServiceImple;

    @Autowired
    private ProductReviewFetchServiceImple productReviewFetchServiceImple;

    @Autowired
    private ProductReviewUpdateServiceImple productReviewUpdateServiceImple;

    @Autowired
    private ProductReviewDeleteServiceImple productReviewDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<ProductReview>> allData() {
        return new ResponseEntity<>(
                productReviewFetchServiceImple.fetchData(),
                HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<ProductReview> singleData(@PathVariable int id) {
        return new ResponseEntity<>(
                productReviewFetchIdServiceImple.fetchData(id),
                HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ProductReview> saveData(
            @RequestBody ProductReview productReview) {

        return new ResponseEntity<>(
                productReviewAddServiceImple.addData(productReview),
                HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ProductReview> updateData(
            @RequestBody ProductReview productReview,
            @PathVariable int id) {

        return new ResponseEntity<>(
                productReviewUpdateServiceImple.updateData(productReview, id),
                HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {
        productReviewDeleteServiceImple.deleteData(id);
    }
}