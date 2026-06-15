package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Role;
import tata.finalproject.repository.RoleRepository;
import tata.finalproject.service.RoleFetchIdService;

@Service
public class RoleFetchIdServiceImple implements RoleFetchIdService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role fetchData(int id) {

        return roleRepository.findById(id).orElse(null);
    }
}