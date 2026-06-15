package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Upi;
import tata.finalproject.repository.UpiRepository;
import tata.finalproject.service.UpiFetchService;

@Service
public class UpiFetchServiceImple implements UpiFetchService {

    @Autowired
    private UpiRepository upiRepository;

    @Override
    public List<Upi> fetchData() {

        return upiRepository.findAll();
    }
}
