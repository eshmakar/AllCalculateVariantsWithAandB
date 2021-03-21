package com.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number 1");
        double a = s.nextDouble();
        System.out.println("Enter the number 2");
        double b = s.nextDouble();
        String strokaA = String.valueOf(a);
        String strokaB = String.valueOf(b);


        double sum = a + b;
        double vychitanie = a - b;
        double vychitanie2 = b - a;

        double umnozhenie = a * b;

        double delenie = a / b;
        double delenie2 = b / a;


        BigDecimal big = new BigDecimal(a);
        BigDecimal resultBig = big.pow((int) b);

        BigDecimal big2 = new BigDecimal(b);
        BigDecimal resultBig2 = big.pow((int) a);

        System.out.printf("%s + %s = %f\n", strokaA, strokaB, sum);
        System.out.printf("%s - %s = %f\n", strokaA, strokaB, vychitanie);
        System.out.printf("%s - %s = %f\n", strokaB, strokaA, vychitanie2);

        System.out.printf("%s * %s = %f\n", strokaA, strokaB, umnozhenie);
        System.out.printf("%s : %s = %f\n", strokaA, strokaB, delenie);
        System.out.printf("%s : %s = %f\n", strokaB, strokaA, delenie2);

        System.out.printf("%s в степени %s = %s\n", strokaB, strokaA, resultBig);
        System.out.printf("%s в степени %s = %s\n", strokaA, strokaB, resultBig2);
        System.out.println();
    }
}
