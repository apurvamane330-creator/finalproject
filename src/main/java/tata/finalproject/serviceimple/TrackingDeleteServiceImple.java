package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.TrackingRepository;
import tata.finalproject.service.TrackingDeleteService;

@Service
public class TrackingDeleteServiceImple implements TrackingDeleteService {

    @Autowired
    private TrackingRepository trackingRepository;

    @Override
    public String deleteData(int id) {

        trackingRepository.deleteById(id);
        return "Tracking Deleted Successfully";
    }
}
