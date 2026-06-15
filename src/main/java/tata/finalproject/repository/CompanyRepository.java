package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
