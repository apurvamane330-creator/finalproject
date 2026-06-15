package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.CodRepository;
import tata.finalproject.service.CodDeleteService;

@Service
public class CodDeleteServiceImple implements CodDeleteService {

    @Autowired
    private CodRepository codRepository;

    @Override
    public String deleteData(int id) {

        codRepository.deleteById(id);
        return "Cod Deleted Successfully";
    }
}