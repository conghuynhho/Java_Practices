package com.java.thuchanh2;

public class Pointer {
    private String name;
    private float x;
    private float y;

    public Pointer(String name ,float x, float y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Pointer() {
    }

    public void PrintPointer() {
        System.out.println("Thông tin vị trí điểm " + name);
        System.out.println("=============");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("=============");
    }

    public float distanceTo(Pointer b) {
        return (float) Math.sqrt(Math.pow(x - b.x, 2) + Math.pow(y - b.y, 2));
    }
}
