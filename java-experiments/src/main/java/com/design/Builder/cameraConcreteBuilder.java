package com.design.Builder;

public class cameraConcreteBuilder extends Builder{
    private Product product;
    public cameraConcreteBuilder() {
        product = new Product();
    }

    @Override
    public Builder bulidA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    public Builder bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    public Builder bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    public Builder bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
    @Override
    public Builder bulidE(String mes) {
        product.setBuildE(mes);
        return this;
    }

    @Override
    public Builder bulidF(String mes) {

        product.setBuildF(mes);
        return this;
    }

    @Override
    public Builder bulidG(String mes) {

        product.setBuildG(mes);
        return this;
    }

    @Override
    public Builder bulidH(String mes) {

        product.setBuildH(mes);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }


}
