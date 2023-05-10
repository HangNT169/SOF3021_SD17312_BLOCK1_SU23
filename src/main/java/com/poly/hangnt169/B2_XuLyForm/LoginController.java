package com.poly.hangnt169.B2_XuLyForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "/buoi2/login";
    }

    @PostMapping("/ket-qua")
    public String ketQuaLogin(@RequestParam("uname") String username,
                              @RequestParam("psw") String password, Model model) {
        // Lay gia tri tu jsp
//        request.getAttr();
        // Hien thi gia tri input sang trang moi
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "/buoi2/hien-thi-ket-qua";
    }

}
