package com.example.app_bc1;

import bounded_contexts.shared.application.AppService;
import com.prueba.Prueba1;
import com.prueba.Prueba2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = AppService.class),
            basePackages = {"com.prueba", "com.example.app_bc1.*", "bounded_contexts.shared.*"})
public class Module1Application {

    public static void main(String[] args) {
        Prueba1 p = new Prueba1();
        Prueba2 p2 = new Prueba2();
        SpringApplication.run(Module1Application.class, args);
    }
}
