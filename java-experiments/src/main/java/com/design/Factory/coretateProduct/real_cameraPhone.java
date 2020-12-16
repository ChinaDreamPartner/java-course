package com.design.Factory.coretateProduct;

import com.design.Factory.Product.*;

public class real_cameraPhone implements cameraPhone {
    @Override
    public void show() {
        System.out.println("摄影手机上市了");
    }
}
