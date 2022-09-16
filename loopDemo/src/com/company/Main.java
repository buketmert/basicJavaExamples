package com.company;

public class Main {

    public static void main(String[] args) {

        // for döngüsü
        for (int i = 1 ; i <= 10 ; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n" + "Tek Sayılar :" + "\n");

        for (int i = 1 ; i <= 10 ; i+=2){

            System.out.print(i + " ");
        }

        // while döngüsü
        System.out.println(" ");
        System.out.println("\n" + "For Döngüsü Bitti");
        int i = 1;
        while (i < 10){
            System.out.print(i + " ");
            i ++;
        }
        System.out.println("\n" + "While Döngüsü Bitti");

        // do-while döngüsü
        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("\n" + "Do-While Döngüsü Bitti");
    }
}
