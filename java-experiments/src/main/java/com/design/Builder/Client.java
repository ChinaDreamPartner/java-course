package com.design.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product1 = director.camoraConcreteBuilder();
        product1.show();
        Product product2 = director.camoraConcreteBuilder();
        product2.show();
        Product product3 = director.camoraConcreteBuilder();
        product3.show();
    }
}
