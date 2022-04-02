package com.java.thuchanh2;


public class KHKinhDoanh extends KhachHang {
    public KHKinhDoanh(long maKH, String tenKH, String ngayHoaDon, float soLuongDien, double donGia) {
        super(maKH, tenKH, ngayHoaDon, soLuongDien, donGia);
    }

    public KHKinhDoanh() {
    }

    @Override
    public double thanhTien() {
        return getSoLuongDien() > 400 ? (400 * getDonGia() + (getSoLuongDien() - 400) * getDonGia() * 1.05) : getSoLuongDien() * getDonGia();
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
        System.out.println("Thành Tiền: " + thanhTien());
        System.out.println("========================");
    }

}
