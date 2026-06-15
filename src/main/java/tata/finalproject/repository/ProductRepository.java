package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
