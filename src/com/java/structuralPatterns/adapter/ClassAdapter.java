package com.java.structuralPatterns.adapter;

/**
 * @ClassName ClassAdapter
 * @Description: 类适配器类
 * @Author Administrator
 * @Date 2020/2/24
 * @Version V1.0
 **/
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request(){
        specificRequest();
    }
}
