package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Feedback;
import tata.finalproject.repository.FeedbackRepository;
import tata.finalproject.service.FeedbackFetchService;

@Service
public class FeedbackFetchServiceImple implements FeedbackFetchService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public List<Feedback> fetchData() {

        return feedbackRepository.findAll();
    }
}