package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Invoice;
import tata.finalproject.repository.InvoiceRepository;
import tata.finalproject.service.InvoiceFetchIdService;

@Service
public class InvoiceFetchIdServiceImple implements InvoiceFetchIdService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice fetchData(int id) {

        return invoiceRepository.findById(id).orElse(null);
    }
}