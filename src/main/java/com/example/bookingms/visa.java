package com.example.bookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

public class visa {
    @GetMapping("/myvisa")
    public String getData(){
        return "Please  book your visa";
    }
}

