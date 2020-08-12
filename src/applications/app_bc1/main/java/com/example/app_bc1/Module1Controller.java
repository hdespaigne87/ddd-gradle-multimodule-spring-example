package com.example.app_bc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module1")
public final class Module1Controller {

    @GetMapping
    public String get() {
        return "MODULE 1";
    }
}
