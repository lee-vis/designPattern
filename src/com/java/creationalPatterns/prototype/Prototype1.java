package com.java.creationalPatterns.prototype;

import javax.swing.*;
import java.awt.*;

public class Prototype1 extends JPanel implements Cloneable{

    Prototype1(){

        JLabel jPanel1 = new JLabel(new ImageIcon("src/resources/images/1.jfif"));
        this.add(jPanel1);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        System.out.println("拷贝成功");
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        JFrame jf=new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1,2));
        Container contentPane=jf.getContentPane();
        Prototype1 obj1=new Prototype1();
        contentPane.add(obj1);
        Prototype1 obj2=(Prototype1)obj1.clone();
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
