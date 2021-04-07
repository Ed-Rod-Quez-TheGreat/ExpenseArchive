package com.EdRodriquez.ExpenseArchive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody //responds with plain text, no templates
    @GetMapping //only handles GET HTTP requests at root path
    public String hello() {
        return "Hello, Archive";
    }

//    @ResponseBody
//    @GetMapping("hello") // handles requests at website rootpath/hello
//    public String helloAgain() {
//        return "Hello Again Archive";
//    }

    @ResponseBody
    @GetMapping("allexpenses") // handles requests at website rootpath/allexpenses
    public String allUserExpenses() {
        return "Here are all your monthly expenses:";
    }

    //Handles requests of the form /hello?name=LaunchCode
    //Takes query param 'name' with given value
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Howdy, " + name + "!";

    }

}
