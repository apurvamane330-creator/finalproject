package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Orders;
import tata.finalproject.serviceimple.OrdersAddServiceImple;
import tata.finalproject.serviceimple.OrdersDeleteServiceImple;
import tata.finalproject.serviceimple.OrdersFetchIdServiceImple;
import tata.finalproject.serviceimple.OrdersFetchServiceImple;
import tata.finalproject.serviceimple.OrdersUpdateServiceImple;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersAddServiceImple ordersAddServiceImple;

    @Autowired
    private OrdersFetchIdServiceImple ordersFetchIdServiceImple;

    @Autowired
    private OrdersFetchServiceImple ordersFetchServiceImple;

    @Autowired
    private OrdersUpdateServiceImple ordersUpdateServiceImple;

    @Autowired
    private OrdersDeleteServiceImple ordersDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Orders>> allData() {

        List<Orders> list = ordersFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Orders> singleData(@PathVariable int id) {

        Orders orders = ordersFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Orders> saveData(@RequestBody Orders orders) {

        Orders o1 = ordersAddServiceImple.addData(orders);

        return new ResponseEntity<>(o1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Orders> updateData(@RequestBody Orders orders,
                                             @PathVariable int id) {

        Orders o1 = ordersUpdateServiceImple.updateData(orders, id);

        return new ResponseEntity<>(o1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        ordersDeleteServiceImple.deleteData(id);
    }
}