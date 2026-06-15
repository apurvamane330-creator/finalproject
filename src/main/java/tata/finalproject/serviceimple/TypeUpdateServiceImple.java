package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Type;
import tata.finalproject.repository.TypeRepository;
import tata.finalproject.service.TypeUpdateService;

@Service
public class TypeUpdateServiceImple implements TypeUpdateService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type updateData(Type type, int id) {

        return typeRepository.save(type);
    }

	
}