package com.java21days.Day3;

import java.util.StringTokenizer;

class TokenTester {
    public static void main(String[] arguments) {
        StringTokenizer st1, st2;

        String quote1 = "GOOG 530.80 -9.98";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());

        String quote2 = "RHT@75.00@0.22";
        st2 = new StringTokenizer(quote2, "@");
        System.out.println("\nToken1: " + st2.nextToken());
        System.out.println("Token2: " + st2.nextToken());
        System.out.println("Token3: " + st2.nextToken());
    }
}