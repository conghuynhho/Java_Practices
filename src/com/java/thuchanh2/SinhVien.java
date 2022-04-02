package com.java.thuchanh2;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public SinhVien() {
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }
    public void printSinhVienInfo() {
        System.out.println("Thông tin sinh viên: ");
        System.out.println("===============");
        System.out.println("Mã Số Sinh Viên: " + maSV);
        System.out.println("Họ Tên Sinh Viên: " + hoTen);
        System.out.println("Điểm Lý Thuyết: " + diemLT);
        System.out.println("Điểm Thực Hành: " + diemTH);
        System.out.println("Điểm TB: " + tinhDiemTB());
    }
}
