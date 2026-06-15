package tata.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tata.finalproject.entity.User;
import tata.finalproject.repository.UserRepository;
import tata.finalproject.service.UserUpdateService;

@Service
public class UserUpdateServiceImple implements UserUpdateService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User updateData(User user, int id) {

        return userRepository.save(user);
    }
}
