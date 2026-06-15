package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Card;
import tata.finalproject.repository.CardRepository;
import tata.finalproject.service.CardFetchIdService;

@Service
public class CardFetchIdServiceImple implements CardFetchIdService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card fetchData(int id) {

        return cardRepository.findById(id).orElse(null);
    }
}