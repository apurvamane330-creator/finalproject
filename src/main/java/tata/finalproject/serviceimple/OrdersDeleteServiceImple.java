package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.OrdersRepository;
import tata.finalproject.service.OrdersDeleteService;

@Service
public class OrdersDeleteServiceImple implements OrdersDeleteService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public String deleteData(int id) {

        ordersRepository.deleteById(id);
        return "Orders Deleted Successfully";
    }
}