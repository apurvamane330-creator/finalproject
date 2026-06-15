package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.PaymentMode;
import tata.finalproject.repository.PaymentModeRepository;
import tata.finalproject.service.PaymentModeAddService;

@Service
public class PaymentModeAddServiceImple implements PaymentModeAddService {

    @Autowired
    private PaymentModeRepository paymentModeRepository;

    @Override
    public PaymentMode addData(PaymentMode paymentMode) {

        return paymentModeRepository.save(paymentMode);
    }
}