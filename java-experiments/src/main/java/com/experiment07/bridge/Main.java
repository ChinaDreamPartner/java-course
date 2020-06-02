package com.experiment07.bridge;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main implements Runnable {
    private static int time = 0;
    synchronized public void run() {
        time = time + 1000;
        try {
            System.out.println(Thread.currentThread().getName()
                    + " 开始过独木桥");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()
                + " 已过独木桥");

    }

    public static void main(String[] args) {
        String ary[] = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈"};
        Main guoQiao = new Main();
        Set<Integer> set = new LinkedHashSet<Integer>();
        while (true) {
            if (set.size() == 10) {
                break;
            }

            int a = (int) (Math.random() * 10);
            set.add(a);
        }
        for (int b : set) {
            Thread th = new Thread(guoQiao, ary[b]);
            th.start();
        }
    }

}
