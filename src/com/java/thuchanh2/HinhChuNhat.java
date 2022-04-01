package com.java.thuchanh2;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;


    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float TinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
    public float TinhDienTich() {
        return chieuDai * chieuRong;
    }
    public void ToString() {
        float dienTich = TinhDienTich();
        float chuVi = TinhChuVi();
        System.out.println("Thông tin hình chữ nhật: ");
        System.out.println("========================");
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
    }
}
