package ru.sertok.spring.boot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ImageTaskController {
    @GetMapping("/task")
    public String get(){
        return "task";
    }
}
