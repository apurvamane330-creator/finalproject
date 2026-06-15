package tata.finalproject.serviceimple;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.User;
import tata.finalproject.repository.UserRepository;
import tata.finalproject.service.UserFetchService;

@Service
public class UserFetchServiceImple implements UserFetchService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> fetchData() {

        return userRepository.findAll();
    }
}