package ru.sertok.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.sertok.spring.boot.models.Role;
import ru.sertok.spring.boot.repositories.UsersRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable("id") Long id, ModelMap model) {
        Optional.ofNullable(usersRepository.findAllById(id)).ifPresent(user -> model.addAttribute("users", user));
        return "users";
    }

    @GetMapping("/users")
    public String getUsers(ModelMap model) {
        model.addAttribute("users", usersRepository.findAll());
        return "users";
    }

}
