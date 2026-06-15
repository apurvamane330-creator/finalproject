package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.CardRepository;
import tata.finalproject.service.CardDeleteService;

@Service
public class CardDeleteServiceImple implements CardDeleteService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public String deleteData(int id) {

        cardRepository.deleteById(id);
        return "Card Deleted Successfully";
    }
}