package com.java.creationalPatterns.builder;

/**
 * @ClassName ConcreteBuilder
 * @Description: 具体建造者：实现了抽象建造者接口
 * @Author Administrator
 * @Date 2020/2/2
 * @Version V1.0
 **/
public class ConcreteBuilder extends Builder {


    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
