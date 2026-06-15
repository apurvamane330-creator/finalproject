package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.PaymentMode;
import tata.finalproject.repository.PaymentModeRepository;
import tata.finalproject.service.PaymentModeFetchIdService;

@Service
public class PaymentModeFetchIdServiceImple implements PaymentModeFetchIdService {

    @Autowired
    private PaymentModeRepository paymentModeRepository;

    @Override
    public PaymentMode fetchData(int id) {

        return paymentModeRepository.findById(id).orElse(null);
    }
}