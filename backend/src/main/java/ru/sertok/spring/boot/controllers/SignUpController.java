package ru.sertok.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sertok.spring.boot.models.User;
import ru.sertok.spring.boot.services.api.UserService;

import java.sql.Date;


@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    @GetMapping("/signUp")
    public String get() {
        return "signUp";
    }

    /* @PostMapping("/signUp")
     public String post(User user) {
         userService.signUp(user);
         return "redirect:/profile";
     }*/
    @PostMapping("/signUp")
    public String post(String name, String birthDate, String password) {
        userService.signUp(
                User.builder()
                        .name(name)
                        .password(password)
                        .birthDate(Date.valueOf(birthDate)).build());
        return "redirect:/profile";
    }
}
