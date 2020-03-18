package com.java.creationalPatterns.abstractFactory;

//抽象产品，动物类
public interface Animal {

    void show();
}


class Horse implements Animal {
    public void show(){
        System.out.println("策马奔腾");
    }
}

class Cattle implements Animal {
    public void show(){
        System.out.println("庖丁解牛");
    }
}