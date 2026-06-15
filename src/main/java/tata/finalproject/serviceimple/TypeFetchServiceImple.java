package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Type;
import tata.finalproject.repository.TypeRepository;
import tata.finalproject.service.TypeFetchService;

@Service
public class TypeFetchServiceImple implements TypeFetchService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<Type> fetchData() {

        return typeRepository.findAll();
    }
}
