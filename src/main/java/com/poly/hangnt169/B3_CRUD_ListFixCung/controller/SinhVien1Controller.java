package com.poly.hangnt169.B3_CRUD_ListFixCung.controller;

import com.poly.hangnt169.B3_CRUD_ListFixCung.entity.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// Tra ve API => Java 6
public class SinhVien1Controller {
    // Tat ca request => Co the tra ve bat cu kieu du lieu gi cac ban can
    @GetMapping("/demo11")
    public List<SinhVien> a() {
        List<SinhVien> sinhViens = new ArrayList<>();
        sinhViens.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
        sinhViens.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
        sinhViens.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
        sinhViens.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
        sinhViens.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
        return sinhViens;
    }
}
