package com.java.prototype;

import java.util.HashMap;
import java.util.Scanner;

public interface Prototype2 extends Cloneable{
    Object clone();
    void computeArea();
}

class Circle implements Prototype2{
    @Override
    public Object clone(){
        Circle c = null;
        try {
            c = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("圆拷贝失败");
            e.printStackTrace();
        }

        return c;
    }
    @Override
    public void computeArea(){
        int r;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        System.out.println("该圆的面积="+3.1415*r*r+"\n");
    }
}

class Square implements Prototype2{

    public Object clone()
    {
        Square b=null;
        try
        {
            b=(Square)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("拷贝正方形失败!");
        }
        return b;
    }
    public void computeArea()
    {
        int a;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.println("该正方形的面积="+a*a+"\n");
    }

    public static void main(String[] args){

        ProtoTypeManager protoTypeManager = new ProtoTypeManager();
        Circle circle = (Circle) protoTypeManager.getShape("circle");
        circle.computeArea();
        Square obj2=(Square)protoTypeManager.getShape("square");
        obj2.computeArea();
    }
}

class ProtoTypeManager {

    private HashMap<String, Prototype2> ht= new HashMap<>();
    public ProtoTypeManager()
    {
        ht.put("circle",new Circle());
        ht.put("square",new Square());
    }
    public void addshape(String key,Prototype2 obj)
    {
        ht.put(key,obj);
    }
    public Prototype2 getShape(String key)
    {
        Prototype2 temp=ht.get(key);
        return (Prototype2) temp.clone();
    }
}