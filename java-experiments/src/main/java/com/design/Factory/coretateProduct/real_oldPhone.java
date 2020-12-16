package com.design.Factory.coretateProduct;


import com.design.Factory.Product.*;
public class real_oldPhone implements oldPhone {
    @Override
    public void show() {
        System.out.println("老年机上市了");
    }
}
