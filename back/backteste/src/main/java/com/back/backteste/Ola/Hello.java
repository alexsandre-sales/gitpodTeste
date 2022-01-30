package com.back.backteste.Ola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value="/")
    public String getMethodName() {
        return "<h1>Ola mundo Java</h1>";
    }
}
