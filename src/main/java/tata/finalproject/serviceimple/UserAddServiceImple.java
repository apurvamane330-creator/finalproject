package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.User;
import tata.finalproject.repository.UserRepository;
import tata.finalproject.service.UserAddService;

@Service
public class UserAddServiceImple implements UserAddService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addData(User user) {
        return userRepository.save(user);
    }
}