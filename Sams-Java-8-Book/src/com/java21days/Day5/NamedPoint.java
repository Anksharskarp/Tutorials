package com.java21days.Day5;

import java.awt.*;

public class NamedPoint extends Point {
    String name;

    NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] arguments) {
        NamedPoint np = new NamedPoint(5, 5, "SmallPoint");
        System.out.println("x is " + np.x);
        System.out.println("y is " + np.y);
        System.out.println("Name is " + np.name);
    }
}
