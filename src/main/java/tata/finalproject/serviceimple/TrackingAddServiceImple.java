package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Tracking;
import tata.finalproject.repository.TrackingRepository;
import tata.finalproject.service.TrackingAddService;

@Service
public class TrackingAddServiceImple implements TrackingAddService {

    @Autowired
    private TrackingRepository trackingRepository;

    @Override
    public Tracking addData(Tracking tracking) {
        return trackingRepository.save(tracking);
    }


}
