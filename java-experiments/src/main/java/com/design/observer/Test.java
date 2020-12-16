package com.design.observer;

import java.util.ArrayList;
import java.util.List;
//测试类
public class Test {

        public static void main(String[] args) {

            ConcreteObserver observer= new ConcreteObserver();
            ConcreteObserver observer1 = new ConcreteObserver();


            Subject subject = new Subject();
            subject.registerObserver(observer);
            subject.registerObserver(observer1);

            subject.setMessage("工厂发生安全事故啦！！！");
            observer.setName("总管");
            observer.setMeasure("上报");
            observer1.setName("工人");
            observer1.setMeasure("维修");

            System.out.println(observer.getMessage());
            System.out.println(observer.getName()+"获得了消息，并采取了"+observer.getMeasure()+"行动");
            System.out.println(observer1.getName()+"获得了消息，并采取了"+observer1.getMeasure()+"行动");



        }
    }

