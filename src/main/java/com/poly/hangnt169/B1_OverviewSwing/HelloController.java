package com.poly.hangnt169.B1_OverviewSwing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/demo")
    public String demo() {
        return "/buoi1/home";
    }
}
