package com.design.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product oldConcreteBuilder() {
        System.out.println("老年机正在建造中....");
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        System.out.println("老年机建造好了\n");
        return builder.getResult();
    }
    public Product camoraConcreteBuilder() {
        System.out.println("摄影手机正在建造中....");
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        builder.bulidE();
        System.out.println("摄影建造好了\n");
        return builder.getResult();
    }

    public Product maxConretateBuilder() {
        System.out.println("旗舰机正在建造中....");
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        builder.bulidE();
        builder.bulidF();
        builder.bulidG();
        builder.bulidH();
        System.out.println("旗舰机建造好了\n");
        return builder.getResult();

    }
}
