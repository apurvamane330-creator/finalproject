package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CustomerQuery;
import tata.finalproject.repository.CustomerQueryRepository;
import tata.finalproject.service.CustomerQueryFetchService;

@Service
public class CustomerQueryFetchServiceImple implements CustomerQueryFetchService {

    @Autowired
    private CustomerQueryRepository customerQueryRepository;

    @Override
    public List<CustomerQuery> fetchData() {

        return customerQueryRepository.findAll();
    }
}