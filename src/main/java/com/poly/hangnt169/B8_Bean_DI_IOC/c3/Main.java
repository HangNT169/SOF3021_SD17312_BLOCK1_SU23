package com.poly.hangnt169.B8_Bean_DI_IOC.c3;

public class Main {

    public static void main(String[] args) {
        TrangPhuc1 t1 = new QuanAo();
        SinhVien sv = new SinhVien(t1);
        // IOC => 1 doi tuongj co the truyen(inject) nhieu trong contructor
        // C1: Inteface Injection
        // C2: Contructor Injection
        // C3: Setter Injection
    }
}
