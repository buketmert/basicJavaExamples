package com.company;

public class Main {

    public static void main(String[] args) {

        int sayı = 220;
        int sayı2 = 284 ;
        int toplam1 = 0;
        int toplam2 = 0;
        //220 - 284

        for (int i =1 ; i < sayı ; i++){
            if ( sayı % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        System.out.println(sayı);
        for (int j= 1; j < sayı2 ; j++){
            if ( sayı2 % j == 0) {
                toplam2 = toplam2 + j;
            }

        }
        System.out.println(sayı2);

        if (sayı == toplam2 && sayı2 == toplam1){
            System.out.println("Arkadaş sayılar");
        }else {
            System.out.println("Arkadaş sayı değiller");
        }




    }
}
