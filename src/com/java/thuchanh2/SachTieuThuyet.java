package com.java.thuchanh2;

public class SachTieuThuyet extends Sach {
    private boolean tinhTrang; // true: Mới , false: Cũ

    public SachTieuThuyet(long maSach, String tenSach, double donGia, int soLuong, String nxb, boolean tinhTrang) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }

    public SachTieuThuyet() {
    }

    public void thongTinSach() {
        System.out.println("Thông tin sách Tiểu Thuyết: ");
        System.out.println("=================");
        System.out.println("Mã sách: " + getMaSach());
        System.out.println("Tên sách: " + getTenSach());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("NXB: " + getNxb());
        System.out.println("Tình trạng: Sách " + (tinhTrang ? "mới" : "cũ"));
    }

    public double thanhTien() {
        return tinhTrang == true ? getSoLuong() * getDonGia() : (getSoLuong() * getDonGia() * 0.2)  ;
    }
}
