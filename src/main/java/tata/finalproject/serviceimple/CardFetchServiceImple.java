package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Card;
import tata.finalproject.repository.CardRepository;
import tata.finalproject.service.CardFetchService;

@Service
public class CardFetchServiceImple implements CardFetchService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public List<Card> fetchData() {

        return cardRepository.findAll();
    }
}