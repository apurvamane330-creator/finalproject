package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Upi;
import tata.finalproject.repository.UpiRepository;
import tata.finalproject.service.UpiFetchIdService;

@Service
public class UpiFetchIdServiceImple implements UpiFetchIdService {

    @Autowired
    private UpiRepository upiRepository;

    @Override
    public Upi fetchData(int id) {

        return upiRepository.findById(id).orElse(null);
    }
}