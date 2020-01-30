package com.java.prototype;

public class Prototype implements Cloneable{

    Prototype () {
        System.out.println("原型创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        System.out.println("原型复制成功");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype1 = new Prototype();
        Prototype prototype2 = (Prototype) prototype1.clone();
        System.out.println("prototype1 == prototype2   " + prototype1.equals(prototype2));
    }
}
