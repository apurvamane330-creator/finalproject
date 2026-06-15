package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
