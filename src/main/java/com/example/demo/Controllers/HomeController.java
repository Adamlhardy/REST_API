package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 */
@RestController
//@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String getHome() {
        return "Welcome to the home page";
    }
}
