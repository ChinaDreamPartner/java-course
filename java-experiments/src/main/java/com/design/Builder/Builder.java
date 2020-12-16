package com.design.Builder;

/*图纸--有些什么东西，需要建造些什么*/
public abstract class Builder {
    //CPU
    public abstract Builder bulidA(String mes);
    //内存
    public abstract Builder bulidB(String mes);
    //电池
    public abstract Builder bulidC(String mes);
    //屏幕
    public abstract Builder bulidD(String mes);
    //摄像头
    public abstract Builder bulidE(String mes);
    //GPS
    public abstract Builder bulidF(String mes);
    //指纹识别
    public abstract Builder bulidG(String mes);
    //NFC
    public abstract Builder bulidH(String mes);

    public abstract Product build();

}
