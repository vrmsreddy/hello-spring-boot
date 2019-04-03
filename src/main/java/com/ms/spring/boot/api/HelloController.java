package com.ms.spring.boot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to SpringBoot World!!!";
    }

    @GetMapping("/ping/{input}")
    public String congrats(@PathVariable String input) {
        return "hi " + input + " Your application deployed successfully....";
    }
}

