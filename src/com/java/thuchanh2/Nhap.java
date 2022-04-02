package com.java.thuchanh2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* Author: Huynh
* */
public class Nhap {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);

    public Nhap() {
    }

    // Nhập số double lớn hơn 0
    public double InputDoubleNotNegative(String name) {
        double result = 0;
        while (true) {
            try {
                System.out.println("Nhập "+ name + ": ");
                String a = reader.readLine();
                result = Double.parseDouble(a);
                while (result <= 0) {
                    System.out.println("Nhập lại " + name + " : ");
                    String userInput = reader.readLine();
                    result = Double.parseDouble(userInput);
                }
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Cần nhập 1 số Double lớn hơn 0");
            }
        }
        return result;
    }

    // Nhap so Long > 0
    public long InputLongNotNegative(String name) {
        long result = 0;
        while (true) {
            try {
                System.out.println("Nhập "+ name + ": ");
                String a = reader.readLine();
                result = Long.parseLong(a);
                while (result <= 0) {
                    System.out.println("Nhập lại " + name + " : ");
                    String userInput = reader.readLine();
                    result = Long.parseLong(userInput);
                }
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Cần nhập một số nguyên dương");
            }
        }
        return result;
    }

    // Nhập số nguyên lớn hơn 0 từ bán phím
    public int InputIntNotNegative(String name) {
        int result = 0;
        while (true) {
            try {
                System.out.println("Nhập "+ name + ": ");
                String a = reader.readLine();
                result = Integer.parseInt(a);
                while (result <= 0) {
                    System.out.println("Nhập lại " + name + " : ");
                    String userInput = reader.readLine();
                    result = Integer.parseInt(userInput);
                }
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Cần nhập một số nguyên dương...");
            }
        }
        return result;
    }

    public float InputFloatNotNegative(String name) {
        float result = 0;
        while (true) {
            try {
                System.out.println("Nhập "+ name + ": ");
                String a = reader.readLine();
                result = Float.parseFloat(a);
                while (result <= 0) {
                    System.out.println("Nhập lại " + name + " : ");
                    String userInput = reader.readLine();
                    result = Float.parseFloat(userInput);
                }
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Cần nhập một số Float dương...");
            }
        }
        return result;
    }

    public float InputFloat(String name) {
        float result = 0;
        while (true) {
            try {
                System.out.println("Nhập "+ name + ": ");
                String a = reader.readLine();
                result = Float.parseFloat(a);
                break;
            } catch (IOException ex) {
                System.out.println("Lỗi nhập xuất!");

            } catch (NumberFormatException e) {
                System.out.println("Cần nhập một số Float ...");
            }
        }
        return result;
    }

    public String InputString(String name) {
        String result;
        do {
            System.out.println("Nhập " + name + ": ");
            result = scanner.nextLine();
        } while (result.length() == 0);
        return result;
    }

    public boolean InputBoolean(String name) {
        /* Input 1 for true
        *  Input 0 for false
        * */
        int userInput;
        do {
            userInput = InputIntNotNegative(name);
        } while (userInput != 1 && userInput != 0);
         return userInput == 1;
    }
}
