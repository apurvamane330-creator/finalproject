package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.FeedbackRepository;
import tata.finalproject.service.FeedbackDeleteService;

@Service
public class FeedbackDeleteServiceImple implements FeedbackDeleteService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public String deleteData(int id) {

        feedbackRepository.deleteById(id);
        return "Feedback Deleted Successfully";
    }
}