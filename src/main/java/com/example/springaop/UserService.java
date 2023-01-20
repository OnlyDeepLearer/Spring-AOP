package com.example.springaop;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getAll(String name) {

        System.out.println("name -> " + name);
        System.out.println("Inside getAll() method ");
        return "Users";

    }


    public String create() {

        System.out.println("Inside create() method ");
        return "User created";

    }

    public String delete() {

        System.out.println("Inside delete() method ");
        return "User deleted";

    }


    public String get() {

        System.out.println("Inside get() method ");
        return "User";

    }


}
