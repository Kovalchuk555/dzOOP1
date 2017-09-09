package com.company;

public class Main {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(50,80);
        Fraction fraction2 = new Fraction(70,50);
        Fraction fraction3 = new Fraction(30,40);
Fraction fraction4 = fraction1.addition(fraction2);
Fraction fraction5= fraction1.addition(fraction3);
Fraction fraction6=fraction4.multiply(fraction5);
        Fraction fraction7=fraction6.getInverseFraction();

        System.out.println(fraction1.toString());
        System.out.println(fraction2.toString());
        System.out.println(fraction3.toString());
        System.out.println("\nR= "+fraction6);
        System.out.println("\nR/1= "+fraction7);

    }
}
