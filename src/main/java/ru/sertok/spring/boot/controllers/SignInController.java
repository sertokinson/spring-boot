package ru.sertok.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String get(ModelMap model, HttpServletRequest request) {
        if (request.getParameterMap().containsKey("error"))
            model.addAttribute("error", true);
        return "signIn";
    }

    @PostMapping("/signIn")
    public String post() {
        return "redirect:/users";
    }
}
