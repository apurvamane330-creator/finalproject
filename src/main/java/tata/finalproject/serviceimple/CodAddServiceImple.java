package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Cod;
import tata.finalproject.repository.CodRepository;
import tata.finalproject.service.CodAddService;

@Service
public class CodAddServiceImple implements CodAddService {

    @Autowired
    private CodRepository codRepository;

    @Override
    public Cod addData(Cod cod) {
        return codRepository.save(cod);
    }
}
