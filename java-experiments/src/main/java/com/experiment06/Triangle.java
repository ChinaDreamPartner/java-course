package com.experiment06;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

class TestTriangle
{
    static void triangle(int a, int b, int c) throws IllegalArgumentException, InputMismatchException
    {
        // starts
        if (a + b <= c || a + c <= b || b + c <= a)
        {
            throw new IllegalArgumentException();
        }
        System.out.println("三角形的三边长为：" + a + "," + b + "," + c);
        // end
    }
}

public class Triangle
{
    public static void main(String[] args)
    {
        int a = 0, b = 0, c = 0;
        Scanner in = new Scanner(System.in);
        try
        {
            // starts
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            TestTriangle.triangle(a, b, c);
            // end
        }catch (InputMismatchException e)
        {
            System.out.println("请输入整数作为三角形的边长！");
        }catch (IllegalArgumentException e)
        {
            System.out.println(a + "," + b + "," + c + "不能构成三角形");
        }
    }
}