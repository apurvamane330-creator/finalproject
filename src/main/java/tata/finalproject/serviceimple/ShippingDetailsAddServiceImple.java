package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ShippingDetails;
import tata.finalproject.repository.ShippingDetailsRepository;
import tata.finalproject.service.ShippingDetailsAddService;

@Service
public class ShippingDetailsAddServiceImple implements ShippingDetailsAddService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;

    @Override
    public ShippingDetails addData(ShippingDetails shippingDetails) {
        return shippingDetailsRepository.save(shippingDetails);
    }
}