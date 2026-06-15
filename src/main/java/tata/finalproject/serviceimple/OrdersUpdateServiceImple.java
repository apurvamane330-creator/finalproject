package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Orders;
import tata.finalproject.repository.OrdersRepository;
import tata.finalproject.service.OrdersUpdateService;

@Service
public class OrdersUpdateServiceImple implements OrdersUpdateService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders updateData(Orders orders, int id) {

        return ordersRepository.save(orders);
    }
}