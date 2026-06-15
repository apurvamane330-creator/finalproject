package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ShippingDetails;
import tata.finalproject.repository.ShippingDetailsRepository;
import tata.finalproject.service.ShippingDetailsUpdateService;

@Service
public class ShippingDetailsUpdateServiceImple implements ShippingDetailsUpdateService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;

    @Override
    public ShippingDetails updateData(ShippingDetails shippingDetails, int id) {

        return shippingDetailsRepository.save(shippingDetails);
    }
}