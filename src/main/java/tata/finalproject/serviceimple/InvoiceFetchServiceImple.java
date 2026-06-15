package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Invoice;
import tata.finalproject.repository.InvoiceRepository;
import tata.finalproject.service.InvoiceFetchService;

@Service
public class InvoiceFetchServiceImple implements InvoiceFetchService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public List<Invoice> fetchData() {

        return invoiceRepository.findAll();
    }
}