package com.poly.hangnt169.B3_CRUD_ListFixCung.service;

import com.poly.hangnt169.B3_CRUD_ListFixCung.entity.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien>getAll();

    void add(SinhVien sinhVien);

    SinhVien detail(String ma);

    void remove(String ma);

}
