package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.ManagerRepository;
import tata.finalproject.service.ManagerDeleteService;

@Service
public class ManagerDeleteServiceImple implements ManagerDeleteService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public String deleteData(int id) {

        managerRepository.deleteById(id);
        return "Manager Deleted Successfully";
    }
}