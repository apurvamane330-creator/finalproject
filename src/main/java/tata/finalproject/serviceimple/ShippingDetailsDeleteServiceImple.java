package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.ShippingDetailsRepository;
import tata.finalproject.service.ShippingDetailsDeleteService;

@Service
public class ShippingDetailsDeleteServiceImple implements ShippingDetailsDeleteService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;

    @Override
    public String deleteData(int id) {

        shippingDetailsRepository.deleteById(id);
        return "ShippingDetails Deleted Successfully";
    }
}
