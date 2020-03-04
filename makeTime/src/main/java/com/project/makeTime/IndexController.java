package com.project.makeTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @ResponseBody
    @GetMapping("/")
    String index() {
        System.out.println("TEST");
        return "HELLO WORLD";
    }
}
