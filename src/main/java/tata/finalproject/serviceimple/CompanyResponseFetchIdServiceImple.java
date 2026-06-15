package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CompanyResponse;
import tata.finalproject.repository.CompanyResponseRepository;
import tata.finalproject.service.CompanyResponseFetchIdService;

@Service
public class CompanyResponseFetchIdServiceImple implements CompanyResponseFetchIdService {

    @Autowired
    private CompanyResponseRepository companyResponseRepository;

    @Override
    public CompanyResponse fetchData(int id) {

        return companyResponseRepository.findById(id).orElse(null);
    }
}