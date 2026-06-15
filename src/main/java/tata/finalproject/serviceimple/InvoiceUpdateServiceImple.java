package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Invoice;
import tata.finalproject.repository.InvoiceRepository;
import tata.finalproject.service.InvoiceUpdateService;

@Service
public class InvoiceUpdateServiceImple implements InvoiceUpdateService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice updateData(Invoice invoice, int id) {

        return invoiceRepository.save(invoice);
    }
}