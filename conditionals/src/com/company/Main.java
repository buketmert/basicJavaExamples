package com.company;

public class Main {

    public static void main(String[] args) {

        int sayi = 20;


        /* if kullanımı

        if (sayi < 20){
            System.out.println("Sayı 20 den küçüktür");
        }

        if (sayi < 21){
            System.out.println("Sayı 21 den küçüktür");
        } */


        /* if else kullanımın ;

        if (sayi < 21){
            System.out.println("Sayı 20 den küçüktür");
        }else {
            System.out.println("Sayı 20 den büyüktür");
        }
        */

        // if else-if kullanımı

        if (sayi <20 ){
            System.out.println("Sayı 20 den küçüktür");
        }else if ( sayi == 20){
            System.out.println("Sayı 20 ye eşittir");
        }else{
            System.out.println("Sayı 20 den büyüktür");
        }

    }
}
