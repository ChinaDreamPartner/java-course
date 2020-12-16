package com.design.adapter;

public class Client {
    public static void main(String[] args) {
        USBTypeC usb=new Adaper(new MicroAdaptee());
        usb.Charging();
        usb.Reading();
    }
}
