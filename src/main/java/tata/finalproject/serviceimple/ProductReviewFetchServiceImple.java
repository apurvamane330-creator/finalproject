package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ProductReview;
import tata.finalproject.repository.ProductReviewRepository;
import tata.finalproject.service.ProductReviewFetchService;

@Service
public class ProductReviewFetchServiceImple implements ProductReviewFetchService {

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Override
    public List<ProductReview> fetchData() {

        return productReviewRepository.findAll();
    }
}