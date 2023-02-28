package com.demo.controller;

import com.demo.Resource.UserResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class User {
    static List<UserResource> userResourcesList = new ArrayList<>();
    UserResource userResource1 = new UserResource(1, 18, "Test1", "PP");
    UserResource userResource2 = new UserResource(2, 18, "Test2", "PP");
    UserResource userResource3 = new UserResource(3, 18, "Test3", "PP");


    @GetMapping(value = "/user")
    public UserResource getUser(int id){
        userResourcesList.add(userResource1);
        userResourcesList.add(userResource2);
        userResourcesList.add(userResource3);
        return userResourcesList.get(id-1);
    }

    @PostMapping(value = "/user/add")
    public void addUser(int id, int age, String name, String address){
        UserResource userResource = new UserResource(1, 18, "Test1", "PP");
        userResourcesList.add(userResource);
        System.out.println("Added successfully");
    }
}
