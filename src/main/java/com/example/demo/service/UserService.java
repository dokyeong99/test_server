package com.example.demo.service;

import com.example.demo.domain.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public void save(UserRequest userRequest){
        userRepository.save(new User(userRequest));
    }

    public List<User> getALl(){
        return userRepository.findAll();
    }

}
