package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.CompanyResponseRepository;
import tata.finalproject.service.CompanyResponseDeleteService;

@Service
public class CompanyResponseDeleteServiceImple implements CompanyResponseDeleteService {

    @Autowired
    private CompanyResponseRepository companyResponseRepository;

    @Override
    public String deleteData(int id) {

        companyResponseRepository.deleteById(id);
        return "CompanyResponse Deleted Successfully";
    }
}