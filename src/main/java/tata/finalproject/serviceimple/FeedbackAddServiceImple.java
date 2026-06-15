package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Feedback;
import tata.finalproject.repository.FeedbackRepository;
import tata.finalproject.service.FeedbackAddService;

@Service
public class FeedbackAddServiceImple implements FeedbackAddService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback addData(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}