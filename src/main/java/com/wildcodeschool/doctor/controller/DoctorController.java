package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DoctorController {

    @GetMapping("/doctor/{number}")

    public ResponseEntity<?> doctor(@PathVariable int number) {
        if (number >= 1 && number <= 13) {
            Doctor doctor13 = new Doctor(number, "Jodie Whittaker");
            return ResponseEntity.ok(doctor13);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", "Question Not Found"));

    }

}
