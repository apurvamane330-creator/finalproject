package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.PaymentModeRepository;
import tata.finalproject.service.PaymentModeDeleteService;

@Service
public class PaymentModeDeleteServiceImple implements PaymentModeDeleteService {

    @Autowired
    private PaymentModeRepository paymentModeRepository;

    @Override
    public String deleteData(int id) {

        paymentModeRepository.deleteById(id);
        return "PaymentMode Deleted Successfully";
    }
}