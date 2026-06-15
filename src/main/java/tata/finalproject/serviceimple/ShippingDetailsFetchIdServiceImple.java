package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ShippingDetails;
import tata.finalproject.repository.ShippingDetailsRepository;
import tata.finalproject.service.ShippingDetailsFetchIdService;

@Service
public class ShippingDetailsFetchIdServiceImple implements ShippingDetailsFetchIdService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;

    @Override
    public ShippingDetails fetchData(int id) {

        return shippingDetailsRepository.findById(id).orElse(null);
    }
}
