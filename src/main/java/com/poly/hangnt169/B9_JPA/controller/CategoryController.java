package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.entity.Category;
import com.poly.hangnt169.B9_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/category1/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/hien-thi")
    public String hienThiCategory(Model model) {
        List<Category> list = categoryService.getAll();
        model.addAttribute("categorys", list);
        return "buoi8/theloai";
    }

    @GetMapping("/api/hien-thi")
    @ResponseBody
    public Page<Category> hienThiApiCategory(
            @RequestParam(name = "pageNo", required = false, defaultValue = "0") Integer pageNo) {
        Integer pageSize = 2;
        return categoryService.getCategoryByPage(pageNo, pageSize);
    }

    @GetMapping("/api/hien-thi1")
    @ResponseBody
    public Category hienThiApiCategory1(
            @RequestParam(name = "id", required = false, defaultValue = "1") Long id,
            @RequestParam(name = "categoryCode", required = false, defaultValue = "C01") String categoryCode) {
        return categoryService.findCategoriesByIdAndCategoryCode(id, categoryCode);
    }

    @GetMapping("/api/hien-thi2")
    @ResponseBody
    public Category hienThiApiCategory2(
            @RequestParam(name = "id", required = false, defaultValue = "1") Long id,
            @RequestParam(name = "categoryCode", required = false, defaultValue = "C01") String categoryCode) {
//        return categoryService.findCategory1(id, categoryCode);
        return categoryService.findCategory2(id, categoryCode);
    }

}
