package com.java.structuralPatterns.adapter;

/**
 * @ClassName ClassAdapterTest
 * @Description: 客户端代码
 * @Author Administrator
 * @Date 2020/2/24
 * @Version V1.0
 **/
public class ClassAdapterTest {

    public static void main(String[] args){
        System.out.println("类适配器模式测试");
        Target target = new ClassAdapter();
        target.request();
    }
}
