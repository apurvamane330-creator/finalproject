package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.PaymentMode;
import tata.finalproject.repository.PaymentModeRepository;
import tata.finalproject.service.PaymentModeFetchService;

@Service
public class PaymentModeFetchServiceImple implements PaymentModeFetchService {

    @Autowired
    private PaymentModeRepository paymentModeRepository;

    @Override
    public List<PaymentMode> fetchData() {

        return paymentModeRepository.findAll();
    }
}