package com.example.hello.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/api/hi")
    public Map<String, String> hello() {
        return Map.of("msg", "Hi Sneha");
    }
}
