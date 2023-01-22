package com.example.springaop;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;


    @GetMapping("/list")
    public String getAll() {

        String str = userService.getAll("Akmal ");
        System.out.println("str = " + str);
        return str;
    }


    @GetMapping
    public String get() {

        userService.get();
        return "user";
    }


    @PostMapping
    public String create() {

        return userService.create();
    }


    @DeleteMapping
    public String delete() {

        return userService.delete();
    }


}
