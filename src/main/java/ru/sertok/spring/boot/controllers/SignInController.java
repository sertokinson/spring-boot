package ru.sertok.spring.boot.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;


@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String get(Authentication authentication, ModelMap model, HttpServletRequest request) {
        if(authentication!=null){
            return "redirect:/profile";
        }
        if (request.getParameterMap().containsKey("error"))
            model.addAttribute("error", true);
        return "signIn";
    }

}
