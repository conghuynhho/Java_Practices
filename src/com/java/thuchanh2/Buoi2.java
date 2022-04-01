package com.java.thuchanh2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buoi2 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);

    public static void cauTaiKhoan() {
        long soTK = 0;
        String tenTK = "";
        double soTien = 0;

        // Nhap SoTK
        while (true) {
            try {
                System.out.println("Nhập số Tài Khoản: ");
                String a = reader.readLine();
                soTK = Long.parseLong(a);
                while (soTK <= 0) {
                    System.out.println("Nhập lại số Tài Khoản: ");
                    String userInput = reader.readLine();
                    soTK = Long.parseLong(userInput);
                }
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Không ép kiểu được");
            }
        }

        // Nhap Ten TK
        do {
            System.out.println("Nhập Tên Tài Khoản: ");
            tenTK = scanner.nextLine();
        } while (tenTK.length() == 0);

        // Nhap So Tien
        soTien = NhapTien();

        TaiKhoan tk1 = new TaiKhoan(soTK, tenTK, soTien);
        System.out.println("==================");
        System.out.println("Tạo tài khoản thành công");
        System.out.println("==================");
        System.out.println("Chọn thao tác muốn thực hiện:");
        System.out.println("1: Nạp tiền");
        System.out.println("2: Chuyển tiền");

        int menuIndex;
        while (true) {
            try {
                String userInput = reader.readLine();
                menuIndex = Integer.parseInt(userInput);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Cần nhập một số nguyên...");
            }
        }

        switch (menuIndex) {
            case 1:
                double tienNap = NhapTien();
                tk1.napTien(tienNap);
                tk1.inTaiKhoan();
                break;
//            case 2 -> cau2();
//            case 3 -> cau3();
//            case 4 -> cau4();
//            case 5 -> cau5();
//            case 6 -> cau6();
//            case 7 -> cau7();
//            case 8 -> cau8();
            default:
                System.out.println("Thoát chương trình...");

        }

    }

    private static double NhapTien() {
        double soTien;
        while (true) {
            try {
                System.out.println("Nhập số Tiền: ");
                String a = reader.readLine();
                soTien = Double.parseDouble(a);
                while (soTien <= 0) {
                    System.out.println("Nhập lại số Tiền: ");
                    String userInput = reader.readLine();
                    soTien = Double.parseDouble(userInput);
                }
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Không ép kiểu được");
            }
        }
        return soTien;
    }

    public static void cauHinhChuNhat () {
        float chieuDai = 0;
        float chieuRong = 0;
        // Nhap chieu dai
        while (true) {
            try {
                System.out.println("Nhập chiều dài: ");
                String a = reader.readLine();
                chieuDai = Float.parseFloat(a);
                while (chieuDai <= 0) {
                    System.out.println("Nhập lại chiều dài: ");
                    String userInput = reader.readLine();
                    chieuDai = Float.parseFloat(userInput);
                }
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Không ép kiểu được");
            }
        }

        // Nhap chieu rong
        while (true) {
            try {
                System.out.println("Nhập chiều rộng: ");
                String a = reader.readLine();
                chieuRong = Float.parseFloat(a);
                while (chieuRong <= 0 || chieuRong > chieuDai) {
                    System.out.println("Nhập lại chiều rộng: ");
                    String userInput = reader.readLine();
                    chieuRong = Float.parseFloat(userInput);
                }
                break;

            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Không ép kiểu được");
            }
        }

        HinhChuNhat x = new HinhChuNhat(chieuDai, chieuRong);
        x.ToString();
    }

    public static void cauBaiSach() {

    }


    public static void main(String[] args) {
        System.out.println("1 :  Bài Tài Khoản");
        System.out.println("2 :  Bài Sách");
        System.out.println("3 :  Bài Tọa Độ");
        System.out.println("4 :  Bài Hình Chữ Nhật");
        System.out.println("5 :  Bài Sinh Viên");
        System.out.println("6 :  Bài Xe");
        System.out.println("7 :  Phần V. Bài tập về nhà câu 1");
        System.out.println("8 :  Thoát ");

        System.out.println("Nhập bài toán theo menu phía trên: ");

        int menuIndex;
        while (true) {
            try {
                String userInput = reader.readLine();
                menuIndex = Integer.parseInt(userInput);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Cần nhập một số nguyên...");
            }
        }

        switch (menuIndex) {
            case 1 -> cauTaiKhoan();
//            case 2 -> cau2();
//            case 3 -> cau3();
            case 4 -> cauHinhChuNhat();
//            case 5 -> cau5();
//            case 6 -> cau6();
//            case 7 -> cau7();
//            case 8 -> cau8();
            default -> {
                System.out.println("Thoát chương trình...");
            }
        }

    }
}
