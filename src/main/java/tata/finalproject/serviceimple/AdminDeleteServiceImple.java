package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.AdminRepository;
import tata.finalproject.service.AdminDeleteService;

@Service
public class AdminDeleteServiceImple implements AdminDeleteService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public String deleteData(int id) {

        adminRepository.deleteById(id);
        return "Admin Deleted Successfully";
    }
}