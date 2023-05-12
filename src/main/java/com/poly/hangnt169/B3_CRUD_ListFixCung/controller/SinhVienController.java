package com.poly.hangnt169.B3_CRUD_ListFixCung.controller;

import com.poly.hangnt169.B3_CRUD_ListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_CRUD_ListFixCung.service.SinhVienService;
import com.poly.hangnt169.B3_CRUD_ListFixCung.service.impl.SinhVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {

    // MVC => Tat ca ham request trong controller => LUON LUON TRA VE VIEW (RETURN STRING)
    private SinhVienService sinhVienService = new SinhVienServiceImpl();

    private List<SinhVien> listSinhVien = new ArrayList<>();

    // interface = new Class
    @GetMapping("/sinh-vien/hien-thi")
//    @RequestMapping(value = "/sinh-vien/hien-thi", method = RequestMethod.POST) // Default : Method Get
    public String hienThiSinhVien(Model model) {
        listSinhVien = sinhVienService.getAll();
        model.addAttribute("sinhViens", listSinhVien);
        return "/buoi3/sinhviens";
    }

//    @GetMapping("/demo11")
//    @ResponseBody
//    public List<SinhVien> a() {
//        List<SinhVien> sinhViens = new ArrayList<>();
//        sinhViens.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
//        sinhViens.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
//        sinhViens.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
//        sinhViens.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
//        sinhViens.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
//        return sinhViens;
//    }
}
