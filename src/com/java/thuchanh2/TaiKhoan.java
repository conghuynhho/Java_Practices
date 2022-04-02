package com.java.thuchanh2;

public class TaiKhoan {
    private long SoTaiKhoan;
    private String TenTaiKhoan;
    private double SoTien;

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan, double soTien) {
        SoTaiKhoan = soTaiKhoan;
        TenTaiKhoan = tenTaiKhoan;
        SoTien = soTien;
    }

    public long getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        SoTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        TenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double soTien) {
        SoTien = soTien;
    }
    public void inTaiKhoan() {
        System.out.println("Thông tin tài khoản: ");
        System.out.println("==================");
        System.out.println("Tên Tài Khoản: " + this.TenTaiKhoan);
        System.out.println("Số Tài Khoản: " + this.SoTaiKhoan);
        System.out.println("Số Tiền trong Tài Khoản: " + this.SoTien);
        System.out.println("==================");
    }
    public void napTien(double soTienNap) {
        setSoTien(this.SoTien + soTienNap);
    }
    public boolean chuyenTien(TaiKhoan nguoiNhan, double soTienChuyen) {
        if(soTienChuyen > getSoTien()) {
            return false;
        } else {
            nguoiNhan.setSoTien(nguoiNhan.getSoTien() + soTienChuyen);
            setSoTien(getSoTien() - soTienChuyen);
            return true;
        }

    }
}

