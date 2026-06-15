package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Card;
import tata.finalproject.repository.CardRepository;
import tata.finalproject.service.CardAddService;

@Service
public class CardAddServiceImple implements CardAddService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card addData(Card card) {
        return cardRepository.save(card);
    }
}
