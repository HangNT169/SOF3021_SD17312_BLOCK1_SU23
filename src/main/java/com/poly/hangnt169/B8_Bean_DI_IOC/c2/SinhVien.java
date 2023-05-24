package com.poly.hangnt169.B8_Bean_DI_IOC.c2;

public class SinhVien {

//    private Vay vay;
    // Class = new Class
    private  TrangPhuc trangPhuc;
    // C2: Interface = new Class

    public SinhVien() {

        this.trangPhuc = new QuanAo();
    }

    public void svMac(){
        trangPhuc.wear();
    }

    // => Su rang buoc long hon => interface


    public void setTrangPhuc(TrangPhuc trangPhuc) {
        this.trangPhuc = trangPhuc;
    }
}
