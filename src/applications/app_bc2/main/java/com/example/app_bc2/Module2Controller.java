package com.example.app_bc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module2")
public final class Module2Controller {

    @GetMapping
    public String get() {
        return "MODULE 2";
    }
}
