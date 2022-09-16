package com.company;

public class Main {

    public static void main(String[] args) {

        //double[] myList = new double[4];
        double[] myList = {1.1, 1.2, 1.3};
        //new olarak oluşturmadan bir farkı yok. Arka tarafta new liyor.
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük = " + max);
    }
}
