package co.develhope.Middlewear02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public String hello(){
        return "Hi, welcome on my application!";
    }
}
