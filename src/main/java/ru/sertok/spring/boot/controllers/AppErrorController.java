package ru.sertok.spring.boot.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.sertok.spring.boot.utils.ErrorCode;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class AppErrorController implements ErrorController {

    @GetMapping(value = "/error")
    public String handleError(HttpServletRequest request) {
        return Optional.ofNullable(
                request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE))
                .map(status -> ErrorCode.valueOf("_".concat(status.toString())).getValue())
                .orElse("error");
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

}