package ru.sertok.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/users")
    public String getUsers(ModelMap model) {
        model.addAttribute("name", "Sergei");
        return "users";
    }

}
