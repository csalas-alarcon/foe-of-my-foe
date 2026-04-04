package com.salas.first_web;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    // 1 Serve HTML on /personal
    // 2. Return JSON on /hello
    @GetMapping(path="/hello")
    public Map<String, String> returnJson() {
        return Map.of(
            "message", "Hello from Spring Web!",
            "status", "success",
            "developer", "AI Engineering Undergrad"
        );
    }
}
