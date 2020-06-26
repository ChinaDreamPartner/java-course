package com.example26.exception;

import java.io.DataOutput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exception {
    public static void main(String[] args) {
        int a = 10, b = 0, x = 0;

        try {
            x = a / b;
            System.out.println(x);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 非运行时的异常，必须处理或者抛出否则不能编译通过。
     */
    public static void IO() throws IOException {

        File file = new File("./hello.txt");
        char[] d = "Welcome to beijing".toCharArray();

        FileWriter out = new FileWriter(file);
        out.write(d);
        out.close();
    }

    /**
     * 异常跟语句执行顺序一致
     * 添加try-catch-finally的快捷键是ctrl+alt+t
     */
    public static void order() {
        int a = 10, b = 0, x = 0;

        try {
            int[] y = new int[-2];
            x = a / b;
            System.out.println(x);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }
    }

    /**
     * 嵌套异常
     */
    public static void nest () {
        int b = 0;
        try {
            int a = 10, c;
            try {
                c = a / b;
                System.out.println("a/b = " + c);
            } catch (IndexOutOfBoundsException E) {
                System.out.println("捕捉超出索引的异常");
            } finally {
                System.out.println("嵌套内层的finally区块");
            }
        } catch (ArithmeticException E) {
            System.out.println("捕捉数学运算异常, b=" + b);
        } finally {
            System.out.println("嵌套外层的finally区块");
            if (b == 0) {
                System.out.println("程序执行发生异常");
            } else {
                System.out.println("程序正常执行完毕");
            }
        }

    }
}
