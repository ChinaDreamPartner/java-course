package com.design.Builder;

/*图纸--有些什么东西，需要建造些什么*/
abstract class Builder {
    //CPU
    abstract Builder bulidA(String mes);
    //内存
    abstract Builder bulidB(String mes);
    //电池
    abstract Builder bulidC(String mes);
    //屏幕
    abstract Builder bulidD(String mes);
    //摄像头
    abstract Builder bulidE(String mes);
    //GPS
    abstract Builder bulidF(String mes);
    //指纹识别
    abstract Builder bulidG(String mes);
    //NFC
    abstract Builder bulidH(String mes);

    abstract Product build();

}
