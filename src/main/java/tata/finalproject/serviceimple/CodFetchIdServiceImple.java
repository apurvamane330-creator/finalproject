package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Cod;
import tata.finalproject.repository.CodRepository;
import tata.finalproject.service.CodFetchIdService;

@Service
public class CodFetchIdServiceImple implements CodFetchIdService {

    @Autowired
    private CodRepository codRepository;

    @Override
    public Cod fetchData(int id) {

        return codRepository.findById(id).orElse(null);
    }
}
