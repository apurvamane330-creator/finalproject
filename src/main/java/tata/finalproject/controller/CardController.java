package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Card;
import tata.finalproject.serviceimple.CardAddServiceImple;
import tata.finalproject.serviceimple.CardDeleteServiceImple;
import tata.finalproject.serviceimple.CardFetchIdServiceImple;
import tata.finalproject.serviceimple.CardFetchServiceImple;
import tata.finalproject.serviceimple.CardUpdateServiceImple;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardAddServiceImple cardAddServiceImple;

    @Autowired
    private CardFetchIdServiceImple cardFetchIdServiceImple;

    @Autowired
    private CardFetchServiceImple cardFetchServiceImple;

    @Autowired
    private CardUpdateServiceImple cardUpdateServiceImple;

    @Autowired
    private CardDeleteServiceImple cardDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Card>> allData() {

        List<Card> list = cardFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Card> singleData(@PathVariable int id) {

        Card card = cardFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Card> saveData(@RequestBody Card card) {

        Card c1 = cardAddServiceImple.addData(card);

        return new ResponseEntity<>(c1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Card> updateData(@RequestBody Card card, @PathVariable int id) {

        Card c1 = cardUpdateServiceImple.updateData(card, id);

        return new ResponseEntity<>(c1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        cardDeleteServiceImple.deleteData(id);
    }
}
