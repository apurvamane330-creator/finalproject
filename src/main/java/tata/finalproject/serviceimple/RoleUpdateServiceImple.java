package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Role;
import tata.finalproject.repository.RoleRepository;
import tata.finalproject.service.RoleUpdateService;

@Service
public class RoleUpdateServiceImple implements RoleUpdateService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role updateData(Role role, int id) {

        return roleRepository.save(role);
    }
}

