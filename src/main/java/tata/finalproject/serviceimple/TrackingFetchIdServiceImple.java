package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Tracking;
import tata.finalproject.repository.TrackingRepository;
import tata.finalproject.service.TrackingFetchIdService;

@Service
public class TrackingFetchIdServiceImple implements TrackingFetchIdService {

    @Autowired
    private TrackingRepository trackingRepository;

    @Override
    public Tracking fetchData(int id) {

        return trackingRepository.findById(id).orElse(null);
    }
}
