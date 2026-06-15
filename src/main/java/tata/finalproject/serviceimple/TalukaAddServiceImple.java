package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.Taluka;
import tata.finalproject.repository.TalukaRepository;
import tata.finalproject.service.TalukaAddService;

@Service
public class TalukaAddServiceImple implements TalukaAddService{

	 @Autowired
	    private TalukaRepository talukaRepository;

		@Override
		public Taluka addData(Taluka taluka) {
			// TODO Auto-generated method stub
			return talukaRepository.save(taluka);
		}

}
