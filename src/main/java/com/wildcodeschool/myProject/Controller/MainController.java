package com.wildcodeschool.myProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/greetings")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }
}