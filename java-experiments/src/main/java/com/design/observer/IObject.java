package com.design.observer;
//主题对象（被观察者）接口
public interface IObject {
    void registerObserver(Observer observer);//注册观察者
    void removeObserver(Observer observer);//删除观察者
    void notifyObserver();//通知观察者
}
