package com.java.creationalPatterns.abstractFactory;

//抽象产品：植物类
public interface Plant {

    void show();
}

//具体产品，水果类
class Fruitage implements Plant {
    public void show(){
        System.out.println("香香甜甜");
    }
}

class Vegetables implements Plant {
    public void show(){
        System.out.println("新鲜美味");
    }
}