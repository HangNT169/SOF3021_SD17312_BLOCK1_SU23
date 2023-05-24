package com.poly.hangnt169.B8_Bean_DI_IOC.c1;

public class GiangVien {

    private TrangPhuc trangPhuc = new TrangPhuc();

    public void giangVienMac(){
        trangPhuc.wear();
    }
}
