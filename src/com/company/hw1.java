package com.company;

public class hw1 {

    public static void main (String[] args) {
        for (int k = 0; k <= 10; k++) {
            double alpha = k * (Math.PI / 5);
            double sin = Math.sin(alpha);
            double cos = Math.cos(alpha);
            System.out.println(alpha + ", " + sin + ", " + cos);
        }
    }
}
