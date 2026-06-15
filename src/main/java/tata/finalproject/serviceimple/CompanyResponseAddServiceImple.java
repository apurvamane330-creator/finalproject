package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CompanyResponse;
import tata.finalproject.repository.CompanyResponseRepository;
import tata.finalproject.service.CompanyResponseAddService;

@Service
public class CompanyResponseAddServiceImple implements CompanyResponseAddService {

    @Autowired
    private CompanyResponseRepository companyResponseRepository;

    @Override
    public CompanyResponse addData(CompanyResponse companyResponse) {

        return companyResponseRepository.save(companyResponse);
    }
}