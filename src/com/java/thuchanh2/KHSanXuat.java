package com.java.thuchanh2;

public class KHSanXuat extends KhachHang {
    private boolean phaDien; // true: 2 pha, false: 3 pha

    public KHSanXuat(long maKH, String tenKH, String ngayHoaDon, float soLuongDien, double donGia, boolean phaDien) {
        super(maKH, tenKH, ngayHoaDon, soLuongDien, donGia);
        this.phaDien = phaDien;
    }

    public KHSanXuat(boolean phaDien) {
        this.phaDien = phaDien;
    }

    public boolean isPhaDien() {
        return phaDien;
    }

    public void setPhaDien(boolean phaDien) {
        this.phaDien = phaDien;
    }

    @Override
    public double thanhTien() {
        if(phaDien) {
            // 2 pha
            return  getSoLuongDien() * getDonGia() * (getSoLuongDien() > 200 ? 0.98 : 1);
        }
        // 3 pha
        return  getSoLuongDien() * getDonGia() * (getSoLuongDien() > 150 ? 0.97 : 1);
    }


    @Override
    public void inThongTin() {
        System.out.println("Thông tin sử dụng điện: ");
        System.out.println("========================");
        System.out.println("Mã Khách Hàng: " + getMaKH());
        System.out.println("Tên Khách Hàng: " + getTenKH());
        System.out.println("Ngày Hóa Đơn: " + getNgayHoaDon());
        System.out.println("Số lượng điện: " + getSoLuongDien());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Pha Điện: " + (phaDien ? "2 pha" : "3 pha"));
        System.out.println("========================");
        System.out.println("Thành Tiền: " + thanhTien());
    }
}
