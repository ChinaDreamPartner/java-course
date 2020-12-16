package com.design.adapter;

/*适配器Adapter类*/
public class Adaper implements TypeC_USB{
    private Adaptee_Mcro adaptee_mcro;

    public  Adaper( Adaptee_Mcro adaptee_mcro){
        this.adaptee_mcro=adaptee_mcro;
    }

    @Override
    public void Charging() {
        adaptee_mcro.Micro_charging();
        System.out.println("适配后的USB接口：快速充电");
    }

    @Override
    public void Reading() {
        adaptee_mcro.Micro_reading();
        System.out.println("适配后的USB接口：读取");
    }
}
