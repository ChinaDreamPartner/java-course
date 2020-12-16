package com.design.Factory.coretateProduct;

import com.design.Factory.Product.*;

public class real_maxPhone  implements maxPhone {
    @Override
    public void show() {
        System.out.println("旗舰手机上市了");
    }
}
