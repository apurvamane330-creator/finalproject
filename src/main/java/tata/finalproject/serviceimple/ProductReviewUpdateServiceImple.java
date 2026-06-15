package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ProductReview;
import tata.finalproject.repository.ProductReviewRepository;
import tata.finalproject.service.ProductReviewUpdateService;

@Service
public class ProductReviewUpdateServiceImple implements ProductReviewUpdateService {

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Override
    public ProductReview updateData(ProductReview productReview, int id) {

        return productReviewRepository.save(productReview);
    }
}