package com.java.creationalPatterns.abstractFactory;

//抽象工厂：农场类
public interface Farm {

    Animal newAnimal();
    Plant newPlant();
}

//具体工厂 郑州
class ZZFarm implements Farm {

    public Animal newAnimal()
    {
        System.out.println("郑州养殖场新牛出生！");
        return new Cattle();
    }
    public Plant newPlant()
    {
        System.out.println("郑州养殖场蔬菜长成！");
        return new Vegetables();
    }
}

//具体工厂 新乡
class XXFarm implements Farm {
    public Animal newAnimal(){
        System.out.println("新乡养殖场新马出生");
        return new Horse();
    }
    public Plant newPlant(){
        System.out.println("新乡养殖场水果长成");
        return new Fruitage();
    }
}