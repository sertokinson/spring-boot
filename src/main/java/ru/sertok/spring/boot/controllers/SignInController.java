package ru.sertok.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String get() {
        return "signIn";
    }

    @PostMapping("/signIn")
    public String post() {
            return "redirect:/users";
    }
}
