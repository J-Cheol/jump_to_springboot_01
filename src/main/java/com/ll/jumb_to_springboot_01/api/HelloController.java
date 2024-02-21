package com.ll.jumb_to_springboot_01.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public String main(){
        return "main";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello SBB";
    }
}
