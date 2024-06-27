package com.wildcodeschool.myProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index() {
        return "Greetings from Doctor 1!";
    }

    @GetMapping("/doctor/2")
    @ResponseBody
    public String index2() {
        return "Greetings from Doctor 2!";
    }

    @GetMapping("/doctor/3")
    @ResponseBody
    public String index3() {
        return "Greetings from Doctor 3!";
    }
}
