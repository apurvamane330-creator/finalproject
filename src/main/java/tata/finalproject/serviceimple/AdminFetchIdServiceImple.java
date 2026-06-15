package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Admin;
import tata.finalproject.repository.AdminRepository;
import tata.finalproject.service.AdminFetchIdService;

@Service
public class AdminFetchIdServiceImple implements AdminFetchIdService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin fetchData(int id) {

        return adminRepository.findById(id).orElse(null);
    }
}