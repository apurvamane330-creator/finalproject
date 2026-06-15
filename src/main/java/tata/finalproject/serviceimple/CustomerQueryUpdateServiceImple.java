package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CustomerQuery;
import tata.finalproject.repository.CustomerQueryRepository;
import tata.finalproject.service.CustomerQueryUpdateService;

@Service
public class CustomerQueryUpdateServiceImple implements CustomerQueryUpdateService {

    @Autowired
    private CustomerQueryRepository customerQueryRepository;

    @Override
    public CustomerQuery updateData(CustomerQuery customerQuery, int id) {

        return customerQueryRepository.save(customerQuery);
    }
}