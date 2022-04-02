package com.java.thuchanh2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Buoi2 {

    /*
    * Common Methods
    *  */
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);
    private static final Nhap nhap = new Nhap();

    // Cau 1: Cau Tai Khoan
    public static void cauTaiKhoan() {
        long soTK = nhap.InputLongNotNegative("Số Tài Khoản");
        String tenTK = nhap.InputString("Tên Tài Khoản");
        double soTien = nhap.InputDoubleNotNegative("Số Tiền");

        TaiKhoan tk1 = new TaiKhoan(soTK, tenTK, soTien);
        System.out.println("==================");
        System.out.println("Tạo tài khoản thành công");
        System.out.println("==================");
        System.out.println("Chọn thao tác muốn thực hiện:");
        System.out.println("1: Nạp tiền");
        System.out.println("2: Chuyển tiền");

        int menuIndex = nhap.InputIntNotNegative("số menu để chọn thao tác");

        switch (menuIndex) {
            case 1 -> {
                double tienNap = nhap.InputDoubleNotNegative("Số Tiền Muốn Nạp");
                tk1.napTien(tienNap);
                tk1.inTaiKhoan();
            }
            case 2 -> {
                long soTaiKhoanNguoiNhan = 0;
                do {
                    soTaiKhoanNguoiNhan = nhap.InputLongNotNegative("Số Tài Khoản Người Nhận ");
                } while (soTaiKhoanNguoiNhan == tk1.getSoTaiKhoan());
                double soTienChuyen = nhap.InputDoubleNotNegative("Số Tiền Muốn Chuyển");
                TaiKhoan tk2 = new TaiKhoan(soTaiKhoanNguoiNhan, "TK2", 0);
                if (tk1.chuyenTien(tk2, soTienChuyen)) {
                    System.out.println("Chuyển tiền cho tài khoản " + soTaiKhoanNguoiNhan + " thành công!!!!");
                    tk1.inTaiKhoan();
                    tk2.inTaiKhoan();
                } else {
                    System.out.println("Số dư không đủ, hãy nạp tiền vào rồi hẵng chuyển tiền nheee.");
                }
            }
            default -> System.out.println("Thoát chương trình...");
        }

    }

    // Cau 2: Cau Bai Sach
    public static void cauBaiSach() {
        System.out.println("Chọn loại sách muốn nhập");
        System.out.println("1: Sách tiểu thuyết");
        System.out.println("2: Sách trinh thám");

        int menuIndex = nhap.InputIntNotNegative("số menu để chọn loại sách");

        long maSach = nhap.InputLongNotNegative("Mã Sách");
        String tenSach = nhap.InputString(" Tên Sách");
        double donGia = nhap.InputDoubleNotNegative("Đơn giá");
        int soLuong = nhap.InputIntNotNegative("Số lượng");
        String nxb = nhap.InputString("Nhà Xuất Bản");


        switch (menuIndex) {
            case 1 -> {
                boolean tinhTrang = nhap.InputBoolean("tình trạng sách (1: Sách mới; 0: Sách cũ)");
                SachTieuThuyet sachTieuThuyet = new SachTieuThuyet(maSach, tenSach, donGia, soLuong, nxb, tinhTrang);
                sachTieuThuyet.thongTinSach();
                sachTieuThuyet.thanhTien();
            }
            case 2 -> {
                float thue = nhap.InputFloatNotNegative("Thuế");
                SachTrinhTham sachTrinhTham = new SachTrinhTham(maSach, tenSach, donGia, soLuong, nxb, thue);
                sachTrinhTham.thongTinSach();
                sachTrinhTham.thanhTien();
            }
            default -> System.out.println("Thoát chương trình");
        }
    }

    public static void cauPointer() {
        System.out.println("Nhập điểm thứ nhất");
        String name1 = nhap.InputString("Tên");
        float x1 = nhap.InputFloat("x1");
        float y1 = nhap.InputFloat("y1");
        System.out.println("Nhập điểm thứ hai");
        String name2 = nhap.InputString("Tên");
        float x2 = nhap.InputFloat("x2");
        float y2 = nhap.InputFloat("y2");

        Pointer pointer1 = new Pointer(name1, x1, y1);
        Pointer pointer2 = new Pointer(name2, x2, y2);
        pointer1.PrintPointer();
        pointer2.PrintPointer();

        float distance = pointer1.distanceTo(pointer2);
        System.out.println("Khoảng cách giữa 2 điểm " + pointer1.getName() + " và " + pointer2.getName() + ": " + distance);

    }

    // Cau 4: Cau Hinh Chu Nhat
    public static void cauHinhChuNhat () {
        float chieuDai = nhap.InputFloatNotNegative("chiều dài");
        float chieuRong = 0;

        do {
            chieuRong = nhap.InputFloatNotNegative("chiều rộng");
        } while (chieuRong >= chieuDai);

        HinhChuNhat x = new HinhChuNhat(chieuDai, chieuRong);
        x.ToString();
    }

    // Cau 5: Bai Sinh Vien
    public static void cauSinhVien () {
        SinhVien sv1 = null;
        SinhVien sv2 = null;
        SinhVien sv3 = null;
        for (int i = 1; i < 4 ; i++) {
            System.out.println("Nhập sinh viên " + i );
            System.out.println("==================");
            int maSV = nhap.InputIntNotNegative("Mã Sinh Viên");
            String hoTen = nhap.InputString("Họ Tên Sinh Viên");
            float diemLT = nhap.InputFloatNotNegative("Điểm Lý Thuyết");
            float diemTH = nhap.InputFloatNotNegative("Điểm Thực Hành");
            SinhVien sv = new SinhVien(maSV, hoTen, diemLT, diemTH);
            switch (i) {
                case 1 -> sv1 = sv;
                case 2 -> sv2 = sv;
                case 3 -> sv3 = sv;
            }
        }

        JFrame jFrame = new JFrame();
        jFrame.setTitle("Quan Ly Sinh Vien");

        String[] columnNames = {"MSSV", "HoTen", "Diem LT", "Diem TH", "Diem TB"};
        Object[][] data = {
                {sv1.getMaSV(), sv1.getHoTen(), sv1.getDiemLT(), sv1.getDiemTH(), sv1.tinhDiemTB()},
                {sv2.getMaSV(), sv2.getHoTen(), sv2.getDiemLT(), sv2.getDiemTH(), sv2.tinhDiemTB()},
                {sv3.getMaSV(), sv3.getHoTen(), sv3.getDiemLT(), sv3.getDiemTH(), sv3.tinhDiemTB()},
        };

        JTable table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(table);
        jFrame.add(sp);
        // Frame Size
        jFrame.setSize(500, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        System.out.print(table);
    }

    public static void cauXe () {
        ArrayList<Xe> xeArrayList = new ArrayList<Xe>();

        while (true) {
            System.out.println("Nhập thông tin cho xe: ");
            System.out.println("=======================");
            System.out.println("Nhập Tên Chủ Xe: ");
            String tenChuXe = scanner.nextLine();
            if(tenChuXe.length() == 0) break;

            String loaiXe = nhap.InputString("Loại Xe");
            double triGia = nhap.InputDoubleNotNegative("Trị Giá Xe");
            int dungTichXylanh = nhap.InputIntNotNegative("Dung tích xylanh");

            Xe xe = new Xe(tenChuXe, loaiXe, triGia, dungTichXylanh);
            xeArrayList.add(xe);
        }
        System.out.println("1");

        Xe[] xeArray = new Xe[xeArrayList.size()];
        xeArray = xeArrayList.toArray(xeArray);


        System.out.println("Chọn thao tác");
        System.out.println("1: In bảng thông tin xe vừa nhập");
        System.out.println("2: Tìm thuế của chủ xe và loại xe");

        int menuIndex = nhap.InputIntNotNegative("số menu để chọn thao tác");

        switch (menuIndex) {
            case 1 -> {
                int arrayLength = xeArray.length;
                String[] columnNames = {"Tên chủ xe", "loại xe", "trị giá", "dung tích xylanh", "Thuế"};
                Object[][] data = new Object[arrayLength][5];
                for (int i = 0; i < arrayLength; i++) {
                    data[i] = new Object[]{xeArray[i].getTenChuXe(), xeArray[i].getLoaiXe(), xeArray[i].getTriGia(), xeArray[i].getDungTichXylanh(), xeArray[i].ThuePhaiDong()};
                }
                JFrame jFrame = new JFrame();
                jFrame.setTitle("Danh sách thông tin xe");
                JTable table = new JTable(data, columnNames);
                table.setBounds(30, 40, 200, 300);
                // adding it to JScrollPane
                JScrollPane sp = new JScrollPane(table);
                jFrame.add(sp);
                // Frame Size
                jFrame.setSize(500, 200);
                jFrame.setLocationRelativeTo(null);
                jFrame.setVisible(true);
                System.out.print(table);
            }
            case 2 -> {
                String tenChuXe = nhap.InputString("Tên Chủ Xe");
                String loaiXe = nhap.InputString("Loại Xe");

                boolean isFound = false;
                for (int i = 0; i < xeArray.length; i++) {
                    Xe x = xeArray[i];
                   if(Objects.equals(x.getTenChuXe(), tenChuXe) && Objects.equals(x.getLoaiXe(), loaiXe)) {
                       System.out.println("Thuế xe của bạn là " + x.ThuePhaiDong());
                       isFound = true;
                       break;
                   }
                }
                if(!isFound) System.out.println("Không tìm thấy xe của bạn trong hệ thống");
            }
        }
    }

    public static void cauTienDien() {
        ArrayList<Object> khachHangArrayList = new ArrayList<Object>();

        mainloop:
        while (true) {
            System.out.println("Chọn loại Khách Hàng");
            System.out.println("1: Khách Hàng Sinh Hoạt");
            System.out.println("2: Khách Hàng Kinh Doanh");
            System.out.println("3: Khách Hàng Sản Xuất");
            System.out.println("4: Thoát chương trình ....");
            int menuIndex = nhap.InputIntNotNegative("Chọn loại Khách Hàng");

            System.out.println("Nhập thông tin khách hàng sử dụng điện: ");
            System.out.println("Nhập Mã Khách Hàng là rỗng để dừng nhập");
            System.out.println("=======================");

            // Nhap maKH
            long maKH = 0;
            while (true) {
                try {
                    System.out.println("Nhập Mã Khách Hàng: ");
                    String a = reader.readLine();
                    if(a.length() == 0 ) {
                        System.out.println("Dừng Nhập...");
                        break mainloop;
                    }
                    maKH = Long.parseLong(a);
                    while (maKH <= 0) {
                        System.out.println("Nhập lại Mã Khách Hàng: ");
                        String userInput = reader.readLine();
                        maKH = Long.parseLong(userInput);
                    }
                    break;
                } catch (IOException ex) {
                    System.out.println("Lỗi nhập xuất!");

                } catch (NumberFormatException e) {
                    System.out.println("Cần nhập một số nguyên dương");
                }
            }

            String tenKH = nhap.InputString("Tên Khách Hàng");
            String ngayHoaDon = nhap.InputString("Ngày Hóa Đơn");
            float soLuongDien = nhap.InputFloat("Số Lượng Điện");
            double donGia = nhap.InputDoubleNotNegative("Đơn giá");

            switch (menuIndex) {
                case 1 -> {
                    float dinhMuc = nhap.InputIntNotNegative("Định Mức");
                    KHSinhHoat khSinhHoat = new KHSinhHoat(maKH, tenKH, ngayHoaDon, soLuongDien, donGia, dinhMuc);
                    khachHangArrayList.add(khSinhHoat);
                }
                case 2 -> {
                    KHKinhDoanh KHKinhDoanh = new KHKinhDoanh(maKH, tenKH, ngayHoaDon, soLuongDien, donGia);
                    khachHangArrayList.add(KHKinhDoanh);
                }
                case 3 -> {
                    boolean phaDien = nhap.InputBoolean("Pha Điện (1: 2 pha, 2: 3 pha)");
                    KHSanXuat khSanXuat = new KHSanXuat(maKH, tenKH, ngayHoaDon, soLuongDien, donGia, phaDien);
                    khachHangArrayList.add(khSanXuat);
                }
                default -> System.out.println("Thoát ....");
            }
        }

//        for (Object o : khachHangArrayList) {
//            o.inThonkTin();
//        }
    }


    public static void main(String[] args) {
        System.out.println("1 :  Bài Tài Khoản");
        System.out.println("2 :  Bài Sách");
        System.out.println("3 :  Bài Tọa Độ");
        System.out.println("4 :  Bài Hình Chữ Nhật");
        System.out.println("5 :  Bài Sinh Viên");
        System.out.println("6 :  Bài Xe");
        System.out.println("7 :  Phần V. Bài tập về nhà câu 1 (Câu Tiền Điện)");
        System.out.println("8 :  Thoát ");


        int menuIndex = nhap.InputIntNotNegative("số menu để chọn bài toán");

        switch (menuIndex) {
            case 1 -> cauTaiKhoan();
            case 2 -> cauBaiSach();
            case 3 -> cauPointer();
            case 4 -> cauHinhChuNhat();
            case 5 -> cauSinhVien();
            case 6 -> cauXe();
            case 7 -> cauTienDien();
            default -> {
                System.out.println("Thoát chương trình...");
            }
        }

    }
}
