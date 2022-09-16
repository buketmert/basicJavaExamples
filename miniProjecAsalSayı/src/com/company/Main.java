package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 1; //asal sayı mı?
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (number == 1){
            System.out.println("Sayı asal değildir");
            return;
        }
        if (isPrime) {
            System.out.println(number + " asal sayıdır");
        } else {
            System.out.println(number + " asal değildir");
        }
    }
}
