package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Invoice;
import tata.finalproject.repository.InvoiceRepository;
import tata.finalproject.service.InvoiceAddService;

@Service
public class InvoiceAddServiceImple implements InvoiceAddService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice addData(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
}