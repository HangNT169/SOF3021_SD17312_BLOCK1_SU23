package com.poly.hangnt169.B3_CRUD_ListFixCung.service.impl;

import com.poly.hangnt169.B3_CRUD_ListFixCung.entity.SinhVien;
import com.poly.hangnt169.B3_CRUD_ListFixCung.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien> sinhViens;

    public SinhVienServiceImpl() {
        this.sinhViens = new ArrayList<>();
        sinhViens.add(new SinhVien("HE130461", "Nguyen Thuy Hang", 10, "Ha Noi", false));
        sinhViens.add(new SinhVien("HE130462", "Nguyen Hoang Tien", 11, "Ha Noi1", true));
        sinhViens.add(new SinhVien("HE130463", "Nguyen Anh Dung", 15, "Ha Noi3", true));
        sinhViens.add(new SinhVien("HE130464", "Vu Van Nguyen", 14, "Ha Noi6", true));
        sinhViens.add(new SinhVien("HE130465", "Tran Tuan Phong", 20, "Ha Noi7", true));
    }

    @Override
    public List<SinhVien> getAll() {
        return sinhViens;
    }
}
