package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CustomerQuery;
import tata.finalproject.repository.CustomerQueryRepository;
import tata.finalproject.service.CustomerQueryFetchIdService;

@Service
public class CustomerQueryFetchIdServiceImple implements CustomerQueryFetchIdService {

    @Autowired
    private CustomerQueryRepository customerQueryRepository;

    @Override
    public CustomerQuery fetchData(int id) {

        return customerQueryRepository.findById(id).orElse(null);
    }
}