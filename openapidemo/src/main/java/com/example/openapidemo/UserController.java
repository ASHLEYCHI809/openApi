package com.example.openapidemo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return repository.save(newUser);
    }



    @GetMapping("/user/{email}")
    User one(@PathVariable String email) {
        User user = repository.findByEmail(email);
        if(user!=null){
            return user;
        }else{
           return null;
        }
    }

    @PutMapping("/user/{email}")
    User replaceUser(@RequestBody User newUser,@PathVariable String email) {
        User user = repository.findByEmail(email);
        if(user!=null){
            user.setEmail(newUser.getEmail());
            user.setPassword(newUser.getPassword());
            user.setFirstName(newUser.getFirstName());
            user.setLastName(newUser.getLastName());
            return repository.save(user);
        }else{
            return repository.save(newUser);
        }

    }

    @DeleteMapping("/employees/{email}")
    void deleteUser(@PathVariable String email) {
        repository.deleteByEmail(email);
    }
}
