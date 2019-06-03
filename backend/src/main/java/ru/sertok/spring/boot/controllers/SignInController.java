package ru.sertok.spring.boot.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.sertok.spring.boot.models.Response;
import ru.sertok.spring.boot.models.User;

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

   /* @GetMapping("/signIn")
    public Response get(Authentication authentication2) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return new Response();
    }*/

    @PostMapping(path = "/test")
    public Response post(@RequestBody User json) {
        return new Response();
    }
}
