package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.UpiRepository;
import tata.finalproject.service.UpiDeleteService;

@Service
public class UpiDeleteServiceImple implements UpiDeleteService {

    @Autowired
    private UpiRepository upiRepository;

    @Override
    public String deleteData(int id) {

        upiRepository.deleteById(id);
        return "Upi Deleted Successfully";
    }
}