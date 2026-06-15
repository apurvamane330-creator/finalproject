package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ProductReview;
import tata.finalproject.repository.ProductReviewRepository;
import tata.finalproject.service.ProductReviewFetchIdService;

@Service
public class ProductReviewFetchIdServiceImple implements ProductReviewFetchIdService {

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Override
    public ProductReview fetchData(int id) {

        return productReviewRepository.findById(id).orElse(null);
    }
}
