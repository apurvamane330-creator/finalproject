package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Manager;
import tata.finalproject.repository.ManagerRepository;
import tata.finalproject.service.ManagerFetchService;

@Service
public class ManagerFetchServiceImple implements ManagerFetchService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public List<Manager> fetchData() {

        return managerRepository.findAll();
    }
}