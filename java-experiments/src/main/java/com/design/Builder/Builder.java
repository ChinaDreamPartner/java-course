package com.design.Builder;

/*图纸--有些什么东西，需要建造些什么*/
public abstract class Builder {
    protected Product product = new Product();
    //CPU
    public abstract void bulidA();
    //内存
    public abstract void bulidB();
    //电池
    public abstract void bulidC();
    //屏幕
    public abstract void bulidD();
    //摄像头
    public abstract void bulidE();
    //GPS
    public abstract void bulidF();
    //指纹识别
    public abstract void bulidG();
    //NFC
    public abstract void bulidH();

    public Product getResult(){
        return product;
    }

}
