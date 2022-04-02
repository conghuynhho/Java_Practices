package com.java.thuchanh2;

public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private double triGia;
    private int dungTichXylanh;

    public Xe(String tenChuXe, String loaiXe, double triGia, int dungTichXylanh) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.triGia = triGia;
        this.dungTichXylanh = dungTichXylanh;
    }
    public Xe() {
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public int getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(int dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }

    public double ThuePhaiDong() {
        if(dungTichXylanh < 100) {
            return triGia * 0.01;
        }
        if(dungTichXylanh <= 175) {
            return triGia * 0.03;
        }
        return triGia * 0.05;
    }
}
