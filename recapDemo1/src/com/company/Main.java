package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {266, 15, 267};
            

                int biggest = arr[0];

                if (arr[0] < arr [1]){
                     biggest = arr[1]; 
                }

                if (arr[0] < arr [2]){
                    biggest = arr[2];
                }
                System.out.println("En büyük sayı : " + biggest);
                

    }
}
