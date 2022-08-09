package com.test.spring.controller;

import com.test.spring.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ValidatorController {

    @PostMapping("/validateBody")
    public ResponseEntity<String> validateBody(@RequestBody @Valid User input,
                                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Ошибки");
        } else {
            System.out.println(input.getName() + input.getEmail());
        }
        return ResponseEntity.ok(bindingResult.getAllErrors().toString());
    }

}

