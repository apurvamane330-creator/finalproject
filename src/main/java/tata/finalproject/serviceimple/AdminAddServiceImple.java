package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Admin;
import tata.finalproject.repository.AdminRepository;
import tata.finalproject.service.AdminAddService;

@Service
public class AdminAddServiceImple implements AdminAddService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin addData(Admin admin) {
        return adminRepository.save(admin);
    }
}