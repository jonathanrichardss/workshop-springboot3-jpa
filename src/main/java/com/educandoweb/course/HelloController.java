package com.educandoweb.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say-hello")
public class HelloController {

    @GetMapping
    String getGreetingsMessage() {
        return "Hello";
    }
}
