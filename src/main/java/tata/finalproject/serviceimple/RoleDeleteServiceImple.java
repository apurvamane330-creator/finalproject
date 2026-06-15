package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.RoleRepository;
import tata.finalproject.service.RoleDeleteService;

@Service
public class RoleDeleteServiceImple implements RoleDeleteService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public String deleteData(int id) {

        roleRepository.deleteById(id);
        return "Role Deleted Successfully";
    }
}