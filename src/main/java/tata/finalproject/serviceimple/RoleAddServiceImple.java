package tata.finalproject.serviceimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Role;
import tata.finalproject.repository.RoleRepository;
import tata.finalproject.service.RoleAddService;

@Service
public class RoleAddServiceImple implements RoleAddService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role addData(Role role) {
        return roleRepository.save(role);
    }
}

