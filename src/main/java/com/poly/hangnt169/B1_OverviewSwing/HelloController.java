package com.poly.hangnt169.B1_OverviewSwing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Tat ca cac class dat trong com => de la bean. Khi danh dau bang annotaion @Controller
// => Se hieu class nay (bean nay) la 1 controller. La tang dung de trao doi giua client va server
public class HelloController {

    // Clent <=> Server : Giao tiep thong qua phuong thuc HTTP.
    // Co 4 phuong thuc co ban: GET,POST,PUT,DELETE
    // CO 2 cach de su dung HTTP
    // MVC: MODELE <=> VIEW <=> CONTROLLER
    // Tat cac cac ham trong controller luon luon tra ve VIEW (STRING)
    @GetMapping("/demo")
    public String hienThiGiaoDienDemo(Model model) {
        model.addAttribute("hangnt169", "PTPM-JAVA");
        return "trang-chu";
    }
}

