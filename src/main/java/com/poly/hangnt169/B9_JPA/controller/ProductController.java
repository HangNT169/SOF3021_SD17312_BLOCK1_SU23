package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.entity.Product;
import com.poly.hangnt169.B9_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        List<Product> list = productService.getAll();
        model.addAttribute("list",list);
        return "/buoi10/trang-chu";
    }
}
