package com.design.observer;

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
