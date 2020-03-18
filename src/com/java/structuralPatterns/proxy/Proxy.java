package com.java.structuralPatterns.proxy;

/**
 * @ClassName Proxy
 * @Description: 代理模式
 * @Author Administrator
 * @Date 2020/2/7
 * @Version V1.0
 **/
public class Proxy {

    public static void main(String[] args) {
        ProxyTest proxyTest = new ProxyTest();
        proxyTest.request();
    }
}

//抽象主题
interface Subject{
    void request();
}
//真实主题
class RealSubject implements Subject{
    @Override
    public void request(){
        System.out.println("访问真实主题");
    }
}
//代理
class ProxyTest implements Subject{
    private RealSubject realSubject = new RealSubject();

    @Override
    public void request(){
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理");
    }
    public void postRequest(){
        System.out.println("访问真实主题的后处理操作");
    }
}

