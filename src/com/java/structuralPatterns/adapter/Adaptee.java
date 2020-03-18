package com.java.structuralPatterns.adapter;

/**
 * @ClassName Adaptee
 * @Description: 适配者接口
 * @Author Administrator
 * @Date 2020/2/24
 * @Version V1.0
 **/
public class Adaptee {

    public void specificRequest(){
        System.out.println("适配者中的业务代码被调用！");
    }
}
