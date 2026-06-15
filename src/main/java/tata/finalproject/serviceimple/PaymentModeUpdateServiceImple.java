package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.PaymentMode;
import tata.finalproject.repository.PaymentModeRepository;
import tata.finalproject.service.PaymentModeUpdateService;

@Service
public class PaymentModeUpdateServiceImple implements PaymentModeUpdateService {

    @Autowired
    private PaymentModeRepository paymentModeRepository;

    @Override
    public PaymentMode updateData(PaymentMode paymentMode, int id) {

        return paymentModeRepository.save(paymentMode);
    }
}