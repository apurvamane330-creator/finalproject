package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.ProductReviewRepository;
import tata.finalproject.service.ProductReviewDeleteService;

@Service
public class ProductReviewDeleteServiceImple implements ProductReviewDeleteService {

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Override
    public String deleteData(int id) {

        productReviewRepository.deleteById(id);
        return "ProductReview Deleted Successfully";
    }
}