package com.design.Builder;

public class ConcreteBuilder extends Builder{

    @Override
    public void bulidA() {
        product.setBuildA("建造 CPU");
    }

    @Override
    public void bulidB() {
        product.setBuildB("建造 内存");
    }

    @Override
    public void bulidC() {
        product.setBuildC("建造 电池");
    }

    @Override
    public void bulidD() {
        product.setBuildD("建造 屏幕");
    }

    @Override
    public void bulidE() {
        product.setBuildE("建造 摄像头");

    }

    @Override
    public void bulidF() {
        product.setBuildF("建造 GPS");
    }

    @Override
    public void bulidG() {
        product.setBuildG("建造 指纹识别");
    }

    @Override
    public void bulidH() {
        product.setBuildH("建造 NFC");
    }
}
