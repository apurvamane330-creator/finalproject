package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.ShippingDetails;
import tata.finalproject.repository.ShippingDetailsRepository;
import tata.finalproject.service.ShippingDetailsFetchService;

@Service
public class ShippingDetailsFetchServiceImple implements ShippingDetailsFetchService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;

    @Override
    public List<ShippingDetails> fetchData() {

        return shippingDetailsRepository.findAll();
    }
}