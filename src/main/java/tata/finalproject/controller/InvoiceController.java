package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Invoice;
import tata.finalproject.serviceimple.InvoiceAddServiceImple;
import tata.finalproject.serviceimple.InvoiceDeleteServiceImple;
import tata.finalproject.serviceimple.InvoiceFetchIdServiceImple;
import tata.finalproject.serviceimple.InvoiceFetchServiceImple;
import tata.finalproject.serviceimple.InvoiceUpdateServiceImple;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceAddServiceImple invoiceAddServiceImple;

    @Autowired
    private InvoiceFetchIdServiceImple invoiceFetchIdServiceImple;

    @Autowired
    private InvoiceFetchServiceImple invoiceFetchServiceImple;

    @Autowired
    private InvoiceUpdateServiceImple invoiceUpdateServiceImple;

    @Autowired
    private InvoiceDeleteServiceImple invoiceDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Invoice>> allData() {

        List<Invoice> list = invoiceFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Invoice> singleData(@PathVariable int id) {

        Invoice invoice = invoiceFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(invoice, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Invoice> saveData(@RequestBody Invoice invoice) {

        Invoice i1 = invoiceAddServiceImple.addData(invoice);

        return new ResponseEntity<>(i1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Invoice> updateData(@RequestBody Invoice invoice,
                                              @PathVariable int id) {

        Invoice i1 = invoiceUpdateServiceImple.updateData(invoice, id);

        return new ResponseEntity<>(i1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        invoiceDeleteServiceImple.deleteData(id);
    }
}