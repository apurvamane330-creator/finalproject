package tata.finalproject.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Upi;
import tata.finalproject.repository.UpiRepository;
import tata.finalproject.service.UpiAddService;

@Service
public class UpiAddServiceImple implements UpiAddService {

    @Autowired
    private UpiRepository upiRepository;

    @Override
    public Upi addData(Upi upi) {
        return upiRepository.save(upi);
    }
}