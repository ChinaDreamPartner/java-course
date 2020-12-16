package com.design.adapter;

/*适配器Adapter类*/
public class Adaper implements TypeC_USB{
    private Adaptee_Micro adaptee_micro;

    public  Adaper( Adaptee_Micro adaptee_micro){
        this.adaptee_micro = adaptee_micro;
    }

    @Override
    public void Charging() {
        adaptee_micro.Micro_charging();
        System.out.println("适配后的USB接口：快速充电");
    }

    @Override
    public void Reading() {
        adaptee_micro.Micro_reading();
        System.out.println("适配后的USB接口：读取");
    }
}
