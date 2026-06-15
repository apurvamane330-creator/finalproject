package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Type;
import tata.finalproject.repository.TypeRepository;
import tata.finalproject.service.TypeFetchIdService;

@Service
public class TypeFetchIdServiceImple implements TypeFetchIdService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type fetchData(int id) {

        return typeRepository.findById(id).orElse(null);
    }
}
