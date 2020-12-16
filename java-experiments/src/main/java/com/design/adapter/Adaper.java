package com.design.adapter;

/*适配器Adapter类*/
public class Adaper implements USBTypeC {
    private MicroAdaptee _microAdaptee;

    public  Adaper( MicroAdaptee _microAdaptee){
        this._microAdaptee = _microAdaptee;
    }

    @Override
    public void Charging() {
        _microAdaptee.Micro_charging();
        System.out.println("适配后的USB接口：快速充电");
    }

    @Override
    public void Reading() {
        _microAdaptee.Micro_reading();
        System.out.println("适配后的USB接口：读取");
    }
}
