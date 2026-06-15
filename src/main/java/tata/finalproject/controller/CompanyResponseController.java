package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.CompanyResponse;
import tata.finalproject.serviceimple.CompanyResponseAddServiceImple;
import tata.finalproject.serviceimple.CompanyResponseDeleteServiceImple;
import tata.finalproject.serviceimple.CompanyResponseFetchIdServiceImple;
import tata.finalproject.serviceimple.CompanyResponseFetchServiceImple;
import tata.finalproject.serviceimple.CompanyResponseUpdateServiceImple;

@RestController
@RequestMapping("/companyresponse")
public class CompanyResponseController {

    @Autowired
    private CompanyResponseAddServiceImple companyResponseAddServiceImple;

    @Autowired
    private CompanyResponseFetchIdServiceImple companyResponseFetchIdServiceImple;

    @Autowired
    private CompanyResponseFetchServiceImple companyResponseFetchServiceImple;

    @Autowired
    private CompanyResponseUpdateServiceImple companyResponseUpdateServiceImple;

    @Autowired
    private CompanyResponseDeleteServiceImple companyResponseDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<CompanyResponse>> allData() {

        List<CompanyResponse> list = companyResponseFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<CompanyResponse> singleData(@PathVariable int id) {

        CompanyResponse companyResponse = companyResponseFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(companyResponse, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<CompanyResponse> saveData(@RequestBody CompanyResponse companyResponse) {

        CompanyResponse c1 = companyResponseAddServiceImple.addData(companyResponse);

        return new ResponseEntity<>(c1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CompanyResponse> updateData(@RequestBody CompanyResponse companyResponse,
                                                      @PathVariable int id) {

        CompanyResponse c1 = companyResponseUpdateServiceImple.updateData(companyResponse, id);

        return new ResponseEntity<>(c1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        companyResponseDeleteServiceImple.deleteData(id);
    }
}
