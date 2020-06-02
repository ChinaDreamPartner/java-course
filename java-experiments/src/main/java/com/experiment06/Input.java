package com.experiment06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        try
        {
            int n = in.nextInt();
            System.out.println(10 - n);
        }catch (InputMismatchException e)
        {
            System.out.println("not int");
        }finally
        {
            System.out.println("end");
        }
    }
}