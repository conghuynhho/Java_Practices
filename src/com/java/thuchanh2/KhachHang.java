package com.java.thuchanh2;

abstract class KhachHang {
    private long maKH;
    private String tenKH;
    private String ngayHoaDon;
    private float soLuongDien;
    private double donGia;

    public long getMaKH() {
        return maKH;
    }

    public void setMaKH(long maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public float getSoLuongDien() {
        return soLuongDien;
    }

    public void setSoLuongDien(float soLuongDien) {
        this.soLuongDien = soLuongDien;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    abstract double thanhTien();

    abstract void inThongTin();
}
