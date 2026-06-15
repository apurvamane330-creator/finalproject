package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.CustomerQueryRepository;
import tata.finalproject.service.CustomerQueryDeleteService;

@Service
public class CustomerQueryDeleteServiceImple implements CustomerQueryDeleteService {

    @Autowired
    private CustomerQueryRepository customerQueryRepository;

    @Override
    public String deleteData(int id) {

        customerQueryRepository.deleteById(id);
        return "CustomerQuery Deleted Successfully";
    }
}