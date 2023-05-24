package com.poly.hangnt169.B8_Bean_DI_IOC.c1;

public class SinhVien {

    private TrangPhuc trangPhuc = new TrangPhuc();

    public void sinhVienMac(){
        trangPhuc.wear();
    }
//    1. TIGHT-COUPLING - Liên kết ràng buộc
//=> Liên kết giáng buộc trong java . 1 class có mối quan hệ chặt chẽ vất rất nhiều class
//=> Khi code logic của class thay đổi => Các class có mqh chạt chẽ với nó => ảnh hưởng
//
//=> MQH chat che : cac class khong nen phu thuoc vao lop ke thua cap thap ma nen phu thuoc vao lop truu tuong
    // 3 cach giam su phu thuoc (loosely coupled)
    // C1: Interface Injection: Thay vi phu thuoc giua cac class => Phu thuoc va abstract class
    // C2: Contructor Injection
    // C3: Setter Injection
}
