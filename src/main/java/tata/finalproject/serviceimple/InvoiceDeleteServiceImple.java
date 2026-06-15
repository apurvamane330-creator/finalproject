package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.InvoiceRepository;
import tata.finalproject.service.InvoiceDeleteService;

@Service
public class InvoiceDeleteServiceImple implements InvoiceDeleteService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public String deleteData(int id) {

        invoiceRepository.deleteById(id);
        return "Invoice Deleted Successfully";
    }
}