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

        return userService.getAll("Ism ");
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
