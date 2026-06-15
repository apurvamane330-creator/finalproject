package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Manager;
import tata.finalproject.repository.ManagerRepository;
import tata.finalproject.service.ManagerFetchIdService;

@Service
public class ManagerFetchIdServiceImple implements ManagerFetchIdService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public Manager fetchData(int id) {

        return managerRepository.findById(id).orElse(null);
    }
}