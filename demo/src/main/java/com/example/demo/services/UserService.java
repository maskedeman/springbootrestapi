package com.example.demo.services;

import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.entities.User;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
//    private List<User> users= new ArrayList<>();


    public User getUser(int id){
//        for (User user1:users) {
//            if(id==user1.getId()){
//
//                return user1;
//            }
//        }
//        return null;
        return userRepository.findById(id).get();


    }
public List<User> getAllUser(){
//        return users;
    return userRepository.findAll();
}

    public String addUser(User user){
//        users.add(user);
//        return "User Added";
        userRepository.save(user);
        return "User Added";
    }



    public String updateUser( User user){
        //List way
//        for (User user1:users) {
//            if(user.getId()==user1.getId()){
//                users.remove(user1);
//                users.add(user);
//                return "Updated";
//            }
//        }
//        return "User not found!!";

        //another way
//        if(userRepository.findById(user.getId()).isPresent()){
//            userRepository.save(user);
//            return "Updated";
//        }
        for (User user1:userRepository.findAll()) {
            if(user.getId()==user1.getId()){
                userRepository.delete(user1);
                userRepository.save(user);
                return "Updated";
            }
        }
        return "User not found!!";

    }
    public String deleteUser(int id){
//        for(User user1:users)
//        {
//            if (id == user1.getId()) {
//                users.remove(user1);
//                return "User Deleted";
//            }
//        }
//        return "User not found";
//    }
        //another way
//        if(userRepository.findById(user.getId()).isPresent()){
//            userRepository.deleteById(id);
//            return "Deleted";
//        }
        for(User user1:userRepository.findAll())
        {
            if (id == user1.getId()) {
                userRepository.deleteById(id);
                return "User Deleted";
            }
        }
        return "User not found";
    }


}
