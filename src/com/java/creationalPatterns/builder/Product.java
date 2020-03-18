package com.java.creationalPatterns.builder;

/**
 * @ClassName Product
 * @Description: 产品角色：包含多个组成部件的复杂对象
 * @Author Administrator
 * @Date 2020/2/2
 * @Version V1.0
 **/
public class Product {

    private String partA;
    private String partB;
    private String partC;


    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show(){
        //显示产品特性
        System.out.println("产品展示~");
        System.out.println(this.partA);
        System.out.println(this.partB);
        System.out.println(this.partC);
    }
}
