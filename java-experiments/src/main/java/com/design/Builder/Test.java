package com.design.Builder;

/**
 * Test.java
 *  测试类
 */
public class Test {
    public static void main(String[] args) {
        oldConcreteBuilder oldconcreteBuilder = new oldConcreteBuilder();
        cameraConcreteBuilder camoraconcreteBuilder = new cameraConcreteBuilder();
        maxConretateBuilder   maxconretateBuilder = new maxConretateBuilder();
        Product product1 =oldconcreteBuilder.build();
        System.out.println("老年机正在建造中....");
        System.out.println(product1.getBuildA());
        System.out.println(product1.getBuildB());
        System.out.println(product1.getBuildC());
        System.out.println(product1.getBuildD());
        System.out.println("老年机建造好了\n");

        Product product2 =camoraconcreteBuilder.build();
        System.out.println("摄影手机正在建造中....");
        System.out.println(product2.getBuildA());
        System.out.println(product2.getBuildB());
        System.out.println(product2.getBuildC());
        System.out.println(product2.getBuildD());
        System.out.println(product2.getBuildE());
        System.out.println("摄影建造好了\n");

        Product product3 =maxconretateBuilder.build();
        System.out.println("旗舰机正在建造中....");
        System.out.println(product3.getBuildA());
        System.out.println(product3.getBuildB());
        System.out.println(product3.getBuildC());
        System.out.println(product3.getBuildD());
        System.out.println(product3.getBuildE());
        System.out.println(product3.getBuildF());
        System.out.println(product3.getBuildG());
        System.out.println(product3.getBuildD());
        System.out.println("旗舰机建造好了\n");
    }
}