package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Manager;
import tata.finalproject.repository.ManagerRepository;
import tata.finalproject.service.ManagerUpdateService;

@Service
public class ManagerUpdateServiceImple implements ManagerUpdateService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public Manager updateData(Manager manager, int id) {

        return managerRepository.save(manager);
    }
}