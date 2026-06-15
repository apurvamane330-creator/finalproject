package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Orders;
import tata.finalproject.repository.OrdersRepository;
import tata.finalproject.service.OrdersFetchIdService;

@Service
public class OrdersFetchIdServiceImple implements OrdersFetchIdService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders fetchData(int id) {

        return ordersRepository.findById(id).orElse(null);
    }
}