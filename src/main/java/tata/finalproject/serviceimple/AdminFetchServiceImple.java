package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Admin;
import tata.finalproject.repository.AdminRepository;
import tata.finalproject.service.AdminFetchService;

@Service
public class AdminFetchServiceImple implements AdminFetchService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> fetchData() {

        return adminRepository.findAll();
    }
}