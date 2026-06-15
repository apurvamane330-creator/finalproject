package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Feedback;
import tata.finalproject.repository.FeedbackRepository;
import tata.finalproject.service.FeedbackUpdateService;

@Service
public class FeedbackUpdateServiceImple implements FeedbackUpdateService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback updateData(Feedback feedback, int id) {

        return feedbackRepository.save(feedback);
    }
}