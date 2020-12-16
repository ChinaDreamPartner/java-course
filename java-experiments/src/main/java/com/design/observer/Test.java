package com.design.observer;

import java.util.ArrayList;
import java.util.List;

//主题对象（被观察者）接口
 interface ISubject {
    void registerObserver(Observer observer);//注册观察者
    void removeObserver(Observer observer);//删除观察者
    void notifyObserver();//通知观察者

}

//主题对象（被观察者）
 class Subject implements ISubject {

    List<Observer> list;

    private String message;

    public Subject() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {

        list.add(observer);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i =0;i<list.size();i++){

            list.get(i).update(message);
        }
    }


    public List<Observer> getList() {
        return list;
    }

    public void setList(List<Observer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Subject [list=" + list + ", message=" + message + "]";
    }

}

//观察者接口

/***
 * 依赖倒转原则
 *
 */
interface Observer {

    void update(Object o);

}

//观察者对象
 class ConcreteObserver implements Observer {

    private String name;
    private String measure;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }


    @Override
    public void update(Object o) {

        this.message = (String) o;



    }

}

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

