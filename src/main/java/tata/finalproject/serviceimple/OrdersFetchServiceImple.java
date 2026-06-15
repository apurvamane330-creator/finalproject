package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Orders;
import tata.finalproject.repository.OrdersRepository;
import tata.finalproject.service.OrdersFetchService;

@Service
public class OrdersFetchServiceImple implements OrdersFetchService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Orders> fetchData() {

        return ordersRepository.findAll();
    }
}