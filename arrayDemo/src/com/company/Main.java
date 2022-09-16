package com.company;

public class Main {

    public static void main(String[] args) {

       // String[] arr = {"Engin", "Derin", "Salih","Buket"};

        String[] students = new String[3];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";

        /*for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }*/

        for (String student:students){
            System.out.println(student);
        }
    }
}
