package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@RequestMapping("/api")
@Controller
public class TestController {

    @ResponseStatus(code = HttpStatus.OK, reason = "OKKKKK")
    @ResponseBody
    @GetMapping("/test")
    public ResponseEntity<?> TestController(){
        return new ResponseEntity<>("test OK", HttpStatus.OK);
    }
}
