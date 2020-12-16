package com.design.observer;

import java.util.ArrayList;
import java.util.List;

//主题对象（被观察者）
public class Subject implements ISubject {

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