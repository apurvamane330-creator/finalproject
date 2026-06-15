package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Tracking;
import tata.finalproject.repository.TrackingRepository;
import tata.finalproject.service.TrackingUpdateService;

@Service
public class TrackingUpdateServiceImple implements TrackingUpdateService {

    @Autowired
    private TrackingRepository trackingRepository;

    @Override
    public Tracking updateData(Tracking tracking, int id) {

        return trackingRepository.save(tracking);
    }
}