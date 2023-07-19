package com.example.demo.controllers;

import com.example.demo.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")

public class HomeController{
    @GetMapping("")
    public User getHome(){
        //return "Hello World in get Method";
        User user= new User(1, "Aman",22);
        return user;
    }

    @PostMapping("")
    public String postHome(){
        return"This is a post";
    }

    @PutMapping("")
    public String putHome(){
        return"This is a put method";
    }

    @DeleteMapping("")
    public String deleteHome(){
        return "This is a delete method";
    }}