package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Cod;
import tata.finalproject.repository.CodRepository;
import tata.finalproject.service.CodUpdateService;

@Service
public class CodUpdateServiceImple implements CodUpdateService {

    @Autowired
    private CodRepository codRepository;

    @Override
    public Cod updateData(Cod cod, int id) {

        return codRepository.save(cod);
    }
}