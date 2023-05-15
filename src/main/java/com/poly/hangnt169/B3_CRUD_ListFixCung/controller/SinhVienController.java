package com.poly.hangnt169.B3_CRUD_ListFixCung.controller;

import com.poly.hangnt169.B3_CRUD_ListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_CRUD_ListFixCung.service.SinhVienService;
import com.poly.hangnt169.B3_CRUD_ListFixCung.service.impl.SinhVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sinh-vien/") // Truyen cai chung trong duong dan len day
// Tat ca cac request o trong controller no se bat dau bang /sinh-vien/
public class SinhVienController {

    // MVC => Tat ca ham request trong controller => LUON LUON TRA VE VIEW (RETURN STRING)
    private SinhVienService sinhVienService = new SinhVienServiceImpl();

    private List<SinhVien> listSinhVien = new ArrayList<>();

    // interface = new Class
    @GetMapping("hien-thi")
//    @RequestMapping(value = "/sinh-vien/hien-thi", method = RequestMethod.POST) // Default : Method Get
    public String hienThiSinhVien(Model model) {
        listSinhVien = sinhVienService.getAll();
        model.addAttribute("sinhViens", listSinhVien);
        return "/buoi3/sinhviens";
    }

    @GetMapping("view-add")
    public String viewAdd() {
        return "/buoi3/add-sinh-vien";
    }

    @PostMapping("add")
    public String addSinhVien(@RequestParam("mssv") String mssv,
                              @RequestParam("ten") String ten,
                              @RequestParam("tuoi") String tuoi,
                              @RequestParam("diaChi") String diaChi,
                              @RequestParam("gioiTinh") String gioiTinh) {
        // Convent ve Object SinhVien
        SinhVien sinhVien = SinhVien.builder()
                .diaChi(diaChi)
                .ma(mssv)
                .ten(ten)
                .tuoi(Integer.valueOf(tuoi))
                .gioiTinh(Boolean.valueOf(gioiTinh))
                .build(); // <=> Khi khong truyen bat cu 1 gia tri nao vao => Contructor Khong Tham So
        // Goi Add Trong Service
        sinhVienService.add(sinhVien);
        // Chuyen lai trang sinh-vien/hien-thi
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("detail/{maSV}")
    public String detailSinhVien(@PathVariable("maSV") String ma, Model model) {
        SinhVien sv = sinhVienService.detail(ma);
        model.addAttribute("sv", sv);
        return "/buoi3/detail-sinh-vien";
    }

    @GetMapping("view-update/{maSV}")
    public String viewUpdate(@PathVariable("maSV") String ma, Model model) {
        SinhVien sv = sinhVienService.detail(ma);
        model.addAttribute("sv", sv);
        return "/buoi3/update-sinh-vien";
    }

    @GetMapping("delete/{ma}")
    public String deleteSinhVien(@PathVariable("ma") String ma) {
        sinhVienService.remove(ma);
        return "redirect:/sinh-vien/hien-thi";
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
