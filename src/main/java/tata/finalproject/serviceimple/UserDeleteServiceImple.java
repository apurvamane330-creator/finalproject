package tata.finalproject.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.repository.UserRepository;
import tata.finalproject.service.UserDeleteService;

@Service
public class UserDeleteServiceImple implements UserDeleteService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String deleteData(int id) {

        userRepository.deleteById(id);
        return "User Deleted Successfully";
    }
}
