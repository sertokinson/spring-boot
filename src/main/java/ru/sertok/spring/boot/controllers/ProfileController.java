package ru.sertok.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.sertok.spring.boot.repositories.UsersRepository;
import ru.sertok.spring.boot.security.details.UserDetailsImpl;
import ru.sertok.spring.boot.transfer.UserDto;


import java.util.Optional;

import static ru.sertok.spring.boot.transfer.UserDto.from;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String get(ModelMap model, Authentication authentication){
        if(authentication==null){
            return "redirect:/signIn";
        }
        model.addAttribute("user",
                from(((UserDetailsImpl)authentication.getPrincipal()).getUser()));
        return "profile";
    }

}
