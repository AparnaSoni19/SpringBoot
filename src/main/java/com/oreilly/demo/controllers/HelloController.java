package com.oreilly.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello") //http://localhost:8080/hello
    public String sayHello(@RequestParam(value="name",defaultValue = "WORLD",required = false)String name, Model model) {
    model.addAttribute("user",name);//???
        return "hello";
    }
}
