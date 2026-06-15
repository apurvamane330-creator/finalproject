package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Type;
import tata.finalproject.repository.TypeRepository;
import tata.finalproject.service.TypeAddService;

@Service
public class TypeAddServiceImple implements TypeAddService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type addData(Type type) {

        return typeRepository.save(type);
    }

	
}