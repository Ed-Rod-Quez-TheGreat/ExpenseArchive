package com.EdRodriquez.ExpenseArchive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody //responds with plain text, no templates
    @GetMapping //only handles GET HTTP requests
    public String hello() {
        return "Hello, Archive";
    }

}
