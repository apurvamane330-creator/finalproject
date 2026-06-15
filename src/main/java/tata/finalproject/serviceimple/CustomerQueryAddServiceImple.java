package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CustomerQuery;
import tata.finalproject.repository.CustomerQueryRepository;
import tata.finalproject.service.CustomerQueryAddService;

@Service
public class CustomerQueryAddServiceImple implements CustomerQueryAddService {

    @Autowired
    private CustomerQueryRepository customerQueryRepository;

    @Override
    public CustomerQuery addData(CustomerQuery customerQuery) {
        return customerQueryRepository.save(customerQuery);
    }
}