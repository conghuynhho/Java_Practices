package com.java.thuchanh2;


public class KHKinhDoanh {
    private long maKH;
    private String tenKH;
    private String ngayHoaDon;
    private float soLuongDien;
    private double donGia;

    public KHKinhDoanh(long maKH, String tenKH, String ngayHoaDon, float soLuongDien, double donGia) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuongDien = soLuongDien;
        this.donGia = donGia;
    }

    public KHKinhDoanh() {}

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

    public double thanhTien() {
        return soLuongDien > 400 ? (400 * donGia + (soLuongDien - 400) * donGia * 1.05) : soLuongDien * donGia;
    }

    public void inThongTin() {
        System.out.println("Thông tin sử dụng điện: ");
        System.out.println("========================");
        System.out.println("Mã Khách Hàng: " + getMaKH());
        System.out.println("Tên Khách Hàng: " + getTenKH());
        System.out.println("Ngày Hóa Đơn: " + getNgayHoaDon());
        System.out.println("Số lượng điện: " + getSoLuongDien());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("========================");
        System.out.println("Thành Tiền: " + thanhTien());
    }

}
