package ru.sertok.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.sertok.spring.boot.repositories.UsersRepository;


@Controller
@RequestMapping(path = "/signIn")
public class SignInController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get() {
        return new ModelAndView("signIn");
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post() {
            return "redirect:/users";
    }
}
