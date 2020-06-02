package com.experiment07.run;
import java.text.SimpleDateFormat;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
public class Rabbit extends Animal {
    Rabbit(String name, int speed, ExecutorService executor, CyclicBarrier barrier) {
        super(name, speed, executor, barrier);
    }


    Rabbit(String name, int speed, ExecutorService executor) {
        super(name, speed, executor);
    }
    @Override
    public void run() {
        try {
            barrier.await();//等待参赛选手都准备就绪
        } catch (Exception e1) {
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(System.currentTimeMillis()));
        while (!FINISH) {
            System.out.println(this.name + " : 我的速度是：" + this.speed + " 我跑了这么多" + this.now + "了");
            try {
                System.out.println("我跑的快，先睡一会");
                Thread.sleep(1000);
                if (now % 10 == 0) {
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
            }
            now += speed;
            finish();
        }
    }

}
