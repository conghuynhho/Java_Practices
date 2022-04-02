package com.java.thuchanh2;

public class KHSinhHoat extends KhachHang {
    private float dinhMuc;

    public KHSinhHoat(long maKH, String tenKH, String ngayHoaDon, float soLuongDien, double donGia, float dinhMuc) {
        super(maKH, tenKH, ngayHoaDon, soLuongDien, donGia);
        this.dinhMuc = dinhMuc;
    }

    public KHSinhHoat(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public float getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double thanhTien() {
        if(getSoLuongDien() <= dinhMuc) {
            return getSoLuongDien() * getDonGia();
        } else {
            return (dinhMuc * getDonGia()) + ((getSoLuongDien() - dinhMuc) * getDonGia() * 2);
        }
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
        System.out.println("Định Mức: " + dinhMuc);
        System.out.println("Thành Tiền: " + thanhTien());
        System.out.println("========================");
    }


}
