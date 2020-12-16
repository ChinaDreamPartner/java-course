package com.design.adapter;

public class Client {
    public static void main(String[] args) {
        TypeC_USB usb=new Adaper(new Adaptee_Mcro());
        usb.Charging();
        usb.Reading();
    }
}
