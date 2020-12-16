package com.design.Factory.coretateFactory;


import com.design.Factory.abstract_Factory;
public class cameraPhone_realFactory implements abstract_Factory {

    @Override
    public void module() {
        System.out.println("照相手机组件生产好了");
    }

    @Override
    public void assemble() {
        System.out.println("照相手机组装好了");
    }
}
