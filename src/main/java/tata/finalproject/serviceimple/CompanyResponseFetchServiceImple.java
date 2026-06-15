package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.CompanyResponse;
import tata.finalproject.repository.CompanyResponseRepository;
import tata.finalproject.service.CompanyResponseFetchService;

@Service
public class CompanyResponseFetchServiceImple implements CompanyResponseFetchService {

    @Autowired
    private CompanyResponseRepository companyResponseRepository;

    @Override
    public List<CompanyResponse> fetchData() {

        return companyResponseRepository.findAll();
    }
}