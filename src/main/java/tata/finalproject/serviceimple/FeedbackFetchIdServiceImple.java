package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Feedback;
import tata.finalproject.repository.FeedbackRepository;
import tata.finalproject.service.FeedbackFetchIdService;

@Service
public class FeedbackFetchIdServiceImple implements FeedbackFetchIdService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback fetchData(int id) {

        return feedbackRepository.findById(id).orElse(null);
    }
}