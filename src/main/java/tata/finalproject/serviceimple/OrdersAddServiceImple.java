package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Orders;
import tata.finalproject.repository.OrdersRepository;
import tata.finalproject.service.OrdersAddService;

@Service
public class OrdersAddServiceImple implements OrdersAddService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders addData(Orders orders) {
        return ordersRepository.save(orders);
    }
}