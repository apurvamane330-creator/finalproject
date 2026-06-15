package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Upi;
import tata.finalproject.repository.UpiRepository;
import tata.finalproject.service.UpiUpdateService;

@Service
public class UpiUpdateServiceImple implements UpiUpdateService {

    @Autowired
    private UpiRepository upiRepository;

    @Override
    public Upi updateData(Upi upi, int id) {

        return upiRepository.save(upi);
    }
}