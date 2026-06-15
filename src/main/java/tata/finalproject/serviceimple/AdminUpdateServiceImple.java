package tata.finalproject.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Admin;
import tata.finalproject.repository.AdminRepository;
import tata.finalproject.service.AdminUpdateService;

@Service
public class AdminUpdateServiceImple implements AdminUpdateService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin updateData(Admin admin, int id) {

        return adminRepository.save(admin);
    }
}