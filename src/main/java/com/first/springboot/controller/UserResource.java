package com.first.springboot.controller;

import com.first.springboot.exception.UserNotFoundException;
import com.first.springboot.model.User;
import com.first.springboot.service.UserDAOService;
//import com.skbank.rest.entity.Message;
//import com.skbank.rest.entity.User;
//import com.skbank.rest.exception.UserNotFoundException;
//import com.skbank.rest.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

// Ref: https://tpu.thinkpower.com.tw/tpu/articleDetails/1761#
// Author: 蔡維宇 2019/12/31 11:54:30
@RestController
public class UserResource {

    @Autowired
    private UserDAOService service;

    // GET /users
    // retreive all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET /users/{id}
    @GetMapping("/users/{id}")
//    @ReadOperation("/users/{id}")
    public User retreiveUser(@PathVariable int id) {
        User user = service.findOne(id);
        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }
        return user;
    }


    @PostMapping("/users")
//    public ResponseEntity<Message> createUser(@Valid @RequestBody User user) {
    public ResponseEntity<String> createUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);

        // CREATED
        // /user/{id} savedUser.getId();
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = service.deleteById(id);
        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }

    }
}
