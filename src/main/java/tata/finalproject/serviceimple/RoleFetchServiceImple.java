package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Role;
import tata.finalproject.repository.RoleRepository;
import tata.finalproject.service.RoleFetchService;

@Service
public class RoleFetchServiceImple implements RoleFetchService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> fetchData() {

        return roleRepository.findAll();
    }
}
