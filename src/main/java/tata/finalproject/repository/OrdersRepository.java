package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
