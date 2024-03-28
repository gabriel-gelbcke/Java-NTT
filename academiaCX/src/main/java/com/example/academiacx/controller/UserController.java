package com.example.academiacx.controller;

import com.example.academiacx.models.StudioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.academiacx.models.UserModel;
import com.example.academiacx.repository.UserRepository;

import com.example.academiacx.services.inter.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> findAll()
    {
        return userService.listUsers();
    }

    @GetMapping(value = "id/{id}")
    public Optional<UserModel> findById(@PathVariable Long id)
    {
        return userService.findById(id);
    }

    @GetMapping(value = "name/{name}")
    public Optional<UserModel> findByName(@PathVariable String name)
    {
        return userService.findByName(name);
    }

    @GetMapping(value = "username/{username}")
    public Optional<UserModel> findByUsername(@PathVariable String username) {return userService.findByUsername(username);}

    @GetMapping(value = "email/{email}")
    public Optional<UserModel> findByEmail(@PathVariable String email)
    {
        return userService.findByEmail(email);
    }

    @PostMapping
    public UserModel save(@RequestBody UserModel userModel)
    {
        return userService.create(userModel);
    }

    @PutMapping
    public UserModel update(@RequestBody UserModel userModel)
    {
        return userService.update(userModel);
    }
}
