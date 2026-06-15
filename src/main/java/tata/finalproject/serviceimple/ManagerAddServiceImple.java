package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Manager;
import tata.finalproject.repository.ManagerRepository;
import tata.finalproject.service.ManagerAddService;

@Service
public class ManagerAddServiceImple implements ManagerAddService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public Manager addData(Manager manager) {
        return managerRepository.save(manager);
    }
}