package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.TypeRepository;
import tata.finalproject.service.TypeDeleteService;

@Service
public class TypeDeleteServiceImple implements TypeDeleteService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public String deleteData(int id) {

        typeRepository.deleteById(id);
        return "Type Deleted Successfully";
    }
}
