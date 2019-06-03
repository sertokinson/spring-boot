package ru.sertok.spring.boot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ImageTaskController {

    @GetMapping("/task")
    public String get(ModelMap model) {
        model.addAttribute("action","Ответить");
        model.addAttribute("value","");
        model.addAttribute("color","black");
        return "task";
    }

    @PostMapping("/task")
    public void post(String result, ModelMap model) {
        if(result!=null){
            if ("dog".equalsIgnoreCase(result)){
                model.addAttribute("success",true);
                model.addAttribute("color","black");
            }
            else{
                model.addAttribute("color","#cc0033");
                model.addAttribute("error",true);
            }
            model.addAttribute("action","Дальше");
            model.addAttribute("value",result);
        }
    }
}
