package com.dokontekno.siantonx.service.user;

import com.dokontekno.siantonx.entity.user.User;
import com.dokontekno.siantonx.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String id){
        return userRepository.getOne(id);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

}
