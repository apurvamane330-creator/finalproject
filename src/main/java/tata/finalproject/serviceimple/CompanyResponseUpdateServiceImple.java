package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CompanyResponse;
import tata.finalproject.repository.CompanyResponseRepository;
import tata.finalproject.service.CompanyResponseUpdateService;

@Service
public class CompanyResponseUpdateServiceImple implements CompanyResponseUpdateService {

    @Autowired
    private CompanyResponseRepository companyResponseRepository;

    @Override
    public CompanyResponse updateData(CompanyResponse companyResponse, int id) {

        return companyResponseRepository.save(companyResponse);
    }
}