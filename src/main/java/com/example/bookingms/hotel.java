package com.example.bookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hotel {
    @GetMapping("/myhotel")
    public String getData(){
        return "Please  book your hotel room";
    }
}
