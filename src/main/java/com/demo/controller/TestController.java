package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<?> TestController(){
        return new ResponseEntity<>(,);
    }
}
