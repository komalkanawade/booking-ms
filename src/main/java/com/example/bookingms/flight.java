package com.example.bookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class flight {
    @GetMapping("/myflight")
    public String getData(){
        return "Please  book your flight";
    }
}

