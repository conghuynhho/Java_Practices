package com.java.thuchanh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Buoi1 {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);

    // Colors variable
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // Tính chu vi, bán kính hình tròn.
    public static void cau1() {

        double R = 0;

        try {
            String a = reader.readLine();
            R = Double.parseDouble(a);
            while (R < 0) {
                System.out.println("Nhap lai ban kinh: ");
                String userInput = reader.readLine();
                R = Double.parseDouble(userInput);
            }

        } catch (IOException ex) {
            System.out.println("Loi nhap xuat!");

        } catch (NumberFormatException e) {
            System.out.println("Khong ep kieu duoc!");
        }

        System.out.println("Ban kinh la :" + R);

        double chuvi = 2 * R * Math.PI;
        double dientich = Math.PI * Math.pow(R, 2);

        System.out.println("Chu Vi la :" + chuvi);
        System.out.println("Dien Tich la :" + dientich);
    }

    public static void cau2() {
        String x = "";
        String y = "";
        do {
            System.out.println("Nhập chuỗi x");
            x = scanner.nextLine();
        } while (x.length() == 0);
        do {
            System.out.println("Nhập chuỗi y");
            y = scanner.nextLine();
        } while (y.length() == 0);


        int xLength = x.length();
        int yLength = y.length();
        boolean is3Chars = xLength >= 3;
        // 1. Độ dài chuỗi x
        System.out.println("*****1*****. ");
        System.out.println("Độ dài chuỗi x là: " + xLength);


        // 2. In ra 3 ký tự đầu tiên của chuỗi x.
        System.out.println("*****2*****. ");
        System.out.println((is3Chars ? "3" : xLength) + " ký tự đầu tiên của chuỗi x là : " + x.substring(0, is3Chars ? 3 : xLength));

        // 3. In ra 3 ký tự cuối cùng của chuỗi x.
        System.out.println("*****3*****. ");
        System.out.println((is3Chars ? "3" : xLength) + " ký tự cuối cùng của chuỗi x là : " + x.substring(is3Chars ? xLength - 3 : 0));

        // 4. In ra ký tự thứ 6 của chuỗi x.
        System.out.println("*****4*****. ");
        System.out.println(xLength >= 6 ? "ký tự thứ 6 của chuỗi x là : " + x.charAt(5) : "Chuỗi x không có ký tự thứ 6.");

        // 5. Tạo chuỗi mới từ 3 ký tự đầu và 3 ký tự cuối của chuỗi x
        System.out.println("*****5*****. ");
        String newString = is3Chars ? x.substring(0, 3) + x.substring(xLength - 3) : "";
        System.out.println(!newString.equals("") ? "Chuỗi mới : " + newString : "Chuỗi x ngắn hơn 3 ký tự nên ko tạo được chuỗi mới.");

        // 6. Kiểm tra chuỗi x, y có bằng nhau hay không (phân biệt chữ hoa, thường)?
        System.out.println("*****6*****. ");
        System.out.println("Chuỗi x " + (x.equals(y) ? "bằng" : "không bằng") + " chuỗi y (phân biệt chữ hoa, thường)");

        // 7. Kiểm tra chuỗi x, y có bằng nhau hay không (không phân biệt chữ hoa, chữ.thường)?
        System.out.println("*****7*****. ");
        System.out.println("Chuỗi x " + (x.equalsIgnoreCase(y) ? "bằng" : "không bằng") + " chuỗi y (không phân biệt chữ hoa, chữ.thường)");

        // 8. Cho biết y có xuất hiện trong x hay không? Nếu có, tại vị trí nào?
        System.out.println("*****8*****. ");
        int index = x.indexOf(y);
        System.out.println(index != -1 ? "y có xuất hiện trong x tại vị trí : " + index : "y không xuất hiện trong x");

        // 9. Cho biết những vị trí xuất hiện của y trong x.
        System.out.println("*****9*****. ");
        String[] indexList = {};
        while (index >= 0) {
            indexList = Arrays.copyOf(indexList, indexList.length + 1);
            indexList[indexList.length - 1] = Integer.toString(index);
            index = x.indexOf(y, index + 1);
        }
        System.out.println(indexList.length > 0 ? "Các vị trí xuất hiện của y trong x là : " + String.join(",", indexList) : "y không xuất hiện trong x");

    }

    // Tính tiền điện
    public static void cau3() {
        float kw = 0;
        while (true) {
            try {
                do {
                    System.out.println("Nhập số kw điện : ");
                    String userInput = reader.readLine();
                    kw = Float.parseFloat(userInput);
                } while (kw < 0);
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi Nhập Xuất");
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai... Bạn chỉ được nhập số nguyên hoặc số thập phân.");
            }
        }


        if (kw <= 50) {
            System.out.println("Tiền điện của bạn : " + kw * 2000);
        } else if (kw <= 100) {
            System.out.println("Tiền điện của bạn : " + (50 * 2000 + (kw - 50) * 2500));
        } else {
            System.out.println("Tiền điện của bạn : " + (50 * 2000 + 50 * 2500 + (kw - 100) * 3500));
        }
    }

    // Vẽ bảng Pythagoras
    public static void cau4() {
        System.out.format("      ");
        for (int i = 1; i <= 10; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.format("%4d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    // Tìm ước chung 2 số nhập vào từ bàn phím
    public static void cau5() {
        int x;
        int y;

        while (true) {
            try {
                System.out.println("Nhập số x: ");
                String userInputX = reader.readLine();
                x = Integer.parseInt(userInputX);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Số x cần phải là một số nguyên");
            }
        }

        while (true) {
            try {
                System.out.println("nhập số y: ");
                String userInputY = reader.readLine();
                y = Integer.parseInt(userInputY);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Số y cần phải là một số nguyên");
            }
        }
        int smaller = Math.min(x, y);
        int result = 1;
        for (int i = smaller; i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                result = i;
                break;
            }
        }
        System.out.println("Ước chung lớn nhất của x và y là : " + result);
    }

    // 6. Tìm tất cả các ước của một số nguyên dương.
    public static void cau6() {
        int x;
        while (true) {
            try {
                do {
                    System.out.println("nhập số nguyên dương x: ");
                    String userInputX = reader.readLine();
                    x = Integer.parseInt(userInputX);
                } while (x < 0);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Số x cần phải là một số nguyên dương. ");
            }
        }

        System.out.println("Tập hợp các ước của x là : ");
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    public static void cau7() {

        // 1. Nhập vào mảng A.
        int n;
        while (true) {
            try {
                do {
                    System.out.println("nhập n số lượng phần tử của mảng A : ");
                    String userInputX = reader.readLine();
                    n = Integer.parseInt(userInputX);
                } while (n < 0);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("Số n cần phải là một số nguyên dương. ");
            }
        }

        int[] arrayA = new int[n];

        System.out.println("Nhập các phần tử của mảng ");
        for (int i = 0; i < n; i++) {
            int x;
            while (true) {
                try {
                    System.out.print("Nhập phần tử thứ " + i + ": ");
                    String userInputX = reader.readLine();
                    x = Integer.parseInt(userInputX);
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException ex) {
                    System.out.println("Số nhập vào cần phải là một số nguyên. ");
                }
            }

            arrayA[i] = x;
        }

        System.out.println("ArrayA: ");
        for (int j : arrayA) {
            System.out.print(j + " ");
        }


        // 2. Tạo mảng B random.
        int[] arrayB = new int[n];
        System.out.println();
        System.out.println("ArrayB: ");
        for (int i = 0; i < arrayB.length; i++) {
            int a = (int)(Math.random() * 100) + 1;
            arrayB[i] = a;
            System.out.print(arrayB[i] + " ");
        }

        // 3. Tạo mảng C từ mảng A.
        int[] arrayC = Arrays.copyOf(arrayA, n);
        System.arraycopy(arrayB, arrayB.length - 3, arrayC, 1, 3);

        System.out.println();
        System.out.println("Thay thế phần tử thứ 1->3 của mảng C bằng 3 phần tử cuối của mảng B: ");
        for (int j : arrayC) {
            System.out.print(j + " ");
        }

        // 4. Sort arrayC
        Arrays.sort(arrayC);
        System.out.println();
        System.out.println("ArrayC sau khi sort tăng dần: ");
        for( int i : arrayC ) {
            System.out.print(i + " ");
        }


    }

    public static void cau8() {
        int a = (int)(Math.random() * 100) + 1;
        System.out.println("A:" + a);
        System.out.println("A2:" + a);
        System.out.println("A2:" + a);
    }

    public static void main(String[] args) {
        System.out.println("1 :  Nhập ban kinh, tính chu vi, dien tich duong tron");
        System.out.println("2 :  Nhap vao chuoi x va y.....");
        System.out.println("3 :  Tinh tien dien");
        System.out.println("4 :  Bảng tính Pythagoras");
        System.out.println("5 :  Tim UCLN cua hai so nguyen nhap tu ban phim");
        System.out.println("6 :  Nhap vao so nguyen duong n liet ke cac uoc cua so nguyen duong");
        System.out.println("7 :  Tuy chon bai 1 va Bai 2 của phần cuối cùng");
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
            case 1 -> cau1();
            case 2 -> cau2();
            case 3 -> cau3();
            case 4 -> cau4();
            case 5 -> cau5();
            case 6 -> cau6();
            case 7 -> cau7();
            case 8 -> cau8();
            default -> {
                System.out.println("Thoát chương trình...");
            }
        }
    }
}
