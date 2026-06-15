package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
