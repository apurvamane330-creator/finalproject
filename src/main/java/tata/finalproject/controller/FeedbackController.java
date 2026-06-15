package tata.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tata.finalproject.entity.Feedback;
import tata.finalproject.serviceimple.FeedbackAddServiceImple;
import tata.finalproject.serviceimple.FeedbackDeleteServiceImple;
import tata.finalproject.serviceimple.FeedbackFetchIdServiceImple;
import tata.finalproject.serviceimple.FeedbackFetchServiceImple;
import tata.finalproject.serviceimple.FeedbackUpdateServiceImple;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackAddServiceImple feedbackAddServiceImple;

    @Autowired
    private FeedbackFetchIdServiceImple feedbackFetchIdServiceImple;

    @Autowired
    private FeedbackFetchServiceImple feedbackFetchServiceImple;

    @Autowired
    private FeedbackUpdateServiceImple feedbackUpdateServiceImple;

    @Autowired
    private FeedbackDeleteServiceImple feedbackDeleteServiceImple;

    @GetMapping("/all")
    public ResponseEntity<List<Feedback>> allData() {

        List<Feedback> list = feedbackFetchServiceImple.fetchData();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<Feedback> singleData(@PathVariable int id) {

        Feedback feedback = feedbackFetchIdServiceImple.fetchData(id);

        return new ResponseEntity<>(feedback, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Feedback> saveData(@RequestBody Feedback feedback) {

        Feedback f1 = feedbackAddServiceImple.addData(feedback);

        return new ResponseEntity<>(f1, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Feedback> updateData(@RequestBody Feedback feedback,
                                               @PathVariable int id) {

        Feedback f1 = feedbackUpdateServiceImple.updateData(feedback, id);

        return new ResponseEntity<>(f1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id) {

        feedbackDeleteServiceImple.deleteData(id);
    }
}