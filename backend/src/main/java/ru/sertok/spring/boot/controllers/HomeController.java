package ru.sertok.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String get() {
        return "home";
    }

    @PostMapping("/home")
    public String post(@RequestParam(name = "redirect", required = false) String redirect) {
        return Optional.ofNullable(redirect).map("redirect:/"::concat).orElse("redirect:/home");
    }
}
