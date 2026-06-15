package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Card;
import tata.finalproject.repository.CardRepository;
import tata.finalproject.service.CardUpdateService;

@Service
public class CardUpdateServiceImple implements CardUpdateService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card updateData(Card card, int id) {

        return cardRepository.save(card);
    }
}