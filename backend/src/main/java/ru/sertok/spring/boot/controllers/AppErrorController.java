package ru.sertok.spring.boot.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AppErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {
        Integer status = (Integer) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            switch (status) {
                case 404:
                    return "error-404";
                case 500:
                    return "error-500";
                case 403:
                    return "error-403";
                default:
                    return "error";
            }
        }
        return "error";
    }

        @Override
        public String getErrorPath () {
            return "/error";
        }

    }