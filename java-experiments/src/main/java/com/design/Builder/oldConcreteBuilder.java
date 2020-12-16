package com.design.Builder;

/**
 * oldConcreteBuilder.java
 *  具体手机建造者（生产商）
 */
class oldConcreteBuilder extends Builder{

    private Product product;
    public oldConcreteBuilder() {
        product = new Product();
    }

    @Override
    Builder bulidA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    Builder bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    Builder bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    Builder bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
    @Override
    Builder bulidE(String mes) {
        product.setBuildE(mes);
        return this;
    }

    @Override
    Builder bulidF(String mes) {

        product.setBuildF(mes);
        return this;
    }

    @Override
    Builder bulidG(String mes) {

        product.setBuildG(mes);
        return this;
    }

    @Override
    Builder bulidH(String mes) {

        product.setBuildH(mes);
        return this;
    }

    @Override
    Product build() {
        return product;
    }


}
