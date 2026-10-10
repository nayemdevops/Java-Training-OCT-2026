package com.syntexpro.students.basic.typeOfConversion;

public class TypeOfConversion {


    public static void main(String[] args) {

        byte b = 99;
        int c = b;
        System.out.println(c);

        int d = 98;
        byte e = (byte)d;
        System.out.println(e);

        double orginalPrice = 1.1234667892D;
        short convertedPrice = (short) orginalPrice;
        System.out.println(orginalPrice);



    }
}
