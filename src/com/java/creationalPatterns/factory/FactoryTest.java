package com.java.creationalPatterns.factory;

public class FactoryTest {

    public static void main(String[] args){

        try{
            Product a;
            Factory f;
            f = (Factory) ReadXML.getObject();
            a = f.newProduct();
            a.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//产品接口：提供了产品的接口
interface Product{

    void show();
}

//具体产品1，实现产品
class ConcreteProduct1 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品1初始化成功");
    }
}

//具体产品2，实现产品
class ConcreteProduct2 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品1初始化成功");
    }
}

//工厂接口：提供了厂品的生成方法
interface Factory{
    Product newProduct();
}

//具体工厂1，实现工厂生产产品的方法
class ConcreteFactory1 implements Factory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂1--->>>生成产品1...");
        return new ConcreteProduct1();
    }
}

//具体工厂2，实现工厂生产产品
class ConcreteFactory2 implements Factory {

    @Override
    public Product newProduct(){
        System.out.println("具体工厂2--->>>生成产品2...");
        return new ConcreteProduct2();
    }
}
