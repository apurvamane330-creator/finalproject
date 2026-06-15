package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Cod;
import tata.finalproject.repository.CodRepository;
import tata.finalproject.service.CodFetchService;

@Service
public class CodFetchServiceImple implements CodFetchService {

    @Autowired
    private CodRepository codRepository;

    @Override
    public List<Cod> fetchData() {

        return codRepository.findAll();
    }
}