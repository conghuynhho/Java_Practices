package com.java.thuchanh2;

public class SachTrinhTham extends Sach {
    private float Thue;

    public SachTrinhTham(long maSach, String tenSach, double donGia, int soLuong, String nxb, float thue) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        Thue = thue;
    }

    public SachTrinhTham() {
    }

    public void thongTinSach() {
        System.out.println("Thông tin sách Trinh Thám: ");
        System.out.println("=================");
        System.out.println("Mã sách: " + getMaSach());
        System.out.println("Tên sách: " + getTenSach());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("NXB: " + getNxb());
        System.out.println("Thuế: " + Thue);
    }

    public double thanhTien() {
        return getSoLuong() * getDonGia() * Thue;
    }
}
