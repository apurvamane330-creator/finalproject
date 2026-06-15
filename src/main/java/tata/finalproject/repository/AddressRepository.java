package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	 Address findByFlatno(Integer flatno);

}
