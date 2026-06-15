package tata.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Tracking;
import tata.finalproject.repository.TrackingRepository;
import tata.finalproject.service.TrackingFetchService;

@Service
public class TrackingFetchServiceImple implements TrackingFetchService {

    @Autowired
    private TrackingRepository trackingRepository;

    @Override
    public List<Tracking> fetchData() {

        return trackingRepository.findAll();
    }
}