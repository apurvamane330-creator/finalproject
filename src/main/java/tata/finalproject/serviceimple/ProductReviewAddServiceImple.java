package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ProductReview;
import tata.finalproject.repository.ProductReviewRepository;
import tata.finalproject.service.ProductReviewAddService;

@Service
public class ProductReviewAddServiceImple implements ProductReviewAddService {

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Override
    public ProductReview addData(ProductReview productReview) {
        return productReviewRepository.save(productReview);
    }
}