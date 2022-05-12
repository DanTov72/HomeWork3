package com.company;

public class Main {

    public static void main(String[] args) {

        double summa = 0.0;
        double[] num1 = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.10, -10.11, 11.12, -12.13, 13.14, 14.15, 15.16};
        int quantity = 0;
        boolean w = false;
        for (double summOfNum : num1) {
            if (summOfNum < 0) {
                w = true;
            } else if (w == true) {
                summa += summOfNum;
                quantity++;
            }

        }
        double num2 = summa / quantity;
        System.out.println("Quantity: " + quantity);
        System.out.println("Summa: " + summa);
        System.out.println("Answer: " + num2);
    }


}


