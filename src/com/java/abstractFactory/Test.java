package com.java.abstractFactory;

public class Test {

    public static void main(String[] args){
        try{
            Farm farm = (Farm) ReadXML.getObject();
            assert farm != null;
            Animal horse = farm.newAnimal();
            horse.show();
            Plant fruitage = farm.newPlant();
            fruitage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
