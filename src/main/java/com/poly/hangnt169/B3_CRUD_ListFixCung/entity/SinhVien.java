package com.poly.hangnt169.B3_CRUD_ListFixCung.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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

    @NotEmpty(message = "Trong day")
    @Min(value = 5)
    private String ma;

    @Pattern(regexp = "[a-z A-Z]+")
    private String ten;

    @NotNull
    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;
//    @Data => import *
//  Ctrl Alt O => Xoa import thua
}
