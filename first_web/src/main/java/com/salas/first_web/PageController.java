package com.salas.first_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    
    @GetMapping("/personal")
    public String serveKiwiPage() {
        return "personal.html";
    }
}
