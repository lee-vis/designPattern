package com.java.creationalPatterns.builder;

/**
 * @ClassName Builder
 * @Description: 抽象建造者：包含创建产品各个子部件的抽象方法
 * @Author Administrator
 * @Date 2020/2/2
 * @Version V1.0
 **/
public abstract class Builder {

    //常见产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult(){
        return product;
    }
}
