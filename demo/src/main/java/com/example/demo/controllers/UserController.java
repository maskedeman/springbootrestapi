package com.example.demo.controllers;
import com.example.demo.entities.User;

import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("")
    public User getUser(@RequestParam("id")int id){
       return userService.getUser(id);
    }
@GetMapping("/getAll")
public List<User> getAllUser(){
        return userService.getAllUser();

}
    @PostMapping("")
    public String addUser(@RequestBody User user){
             return userService.addUser(user);
    }

    @PutMapping("")
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("")
    public String deleteUser(@RequestParam("id") int id){
        return userService.deleteUser(id);
    }
}
