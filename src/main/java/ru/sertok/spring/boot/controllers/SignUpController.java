package ru.sertok.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.sertok.spring.boot.models.User;
import ru.sertok.spring.boot.repositories.UsersRepository;


@Controller
public class SignUpController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/signUp")
    public String get() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String post(User user) {
        usersRepository.save(user);
        return "redirect:/users";
    }
}
