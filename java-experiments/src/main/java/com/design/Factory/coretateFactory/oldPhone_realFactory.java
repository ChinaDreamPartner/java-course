package com.design.Factory.coretateFactory;


import com.design.Factory.abstract_Factory;
public class oldPhone_realFactory implements abstract_Factory {

    @Override
    public void bujian() {
        System.out.println("老年机部件生产好了");
    }

    @Override
    public void zuzhuang() {
        System.out.println("老年机组装好了");
    }
}
