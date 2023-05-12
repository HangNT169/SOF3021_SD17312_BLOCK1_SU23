package com.poly.hangnt169.B3_CRUD_ListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder // Giup tao duoc 1 contructor co so luong tham so tuy y
public class SinhVien {

    private String ma;

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;
//    @Data => import *
//  Ctrl Alt O => Xoa import thua
}
