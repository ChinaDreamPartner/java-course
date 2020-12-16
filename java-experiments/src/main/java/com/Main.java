package com;

import java.util.*;

class Triangle {
    public int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void _if() throws IllegalArgumentException {
        if (a + b >= c || a <= c - b) {
           throw  new IllegalArgumentException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
        Triangle tri = new Triangle(a,b,c);
        try {
            tri._if();
        }catch (Exception e){
            System.out.println("不能构成三角形");
        }

    }
}
