package com.design.Factory.coretateFactory;


import com.design.Factory.abstract_Factory;
public class maxPhone_realFactory implements abstract_Factory {

    @Override
    public void module() {
        System.out.println("旗舰手机部件生产好了");
    }

    @Override
    public void assemble() {
        System.out.println("旗舰手机组装好了");
    }
}