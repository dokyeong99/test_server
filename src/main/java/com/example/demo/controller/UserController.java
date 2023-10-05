package com.example.demo.controller;

import com.example.demo.domain.entity.User;
import com.example.demo.request.UserRequest;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody UserRequest userRequest){
        userService.save(userRequest);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getALl();
    }


}
