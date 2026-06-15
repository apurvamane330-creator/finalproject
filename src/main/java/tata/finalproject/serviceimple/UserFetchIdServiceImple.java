package tata.finalproject.serviceimple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.User;
import tata.finalproject.repository.UserRepository;
import tata.finalproject.service.UserFetchIdService;

@Service
public class UserFetchIdServiceImple implements UserFetchIdService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User fetchData(int id) {

        return userRepository.findById(id).orElse(null);
    }
}