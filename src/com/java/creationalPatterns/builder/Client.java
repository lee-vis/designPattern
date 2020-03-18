package com.java.creationalPatterns.builder;

/**
 * @ClassName Client
 * @Description: 客户端（调用）
 * @Author Administrator
 * @Date 2020/2/2
 * @Version V1.0
 **/
public class Client {

    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
