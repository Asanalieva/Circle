package com.company;

public class Circle {
    static private int radius;

    static void area(){
        System.out.println(Math.PI*(radius*radius));
    }
    static void circumference(){
        System.out.println(Math.PI * 2 * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
