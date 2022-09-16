package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String message = "    Bugün hava çok güzel.     ";
       /* System.out.println(message);
        System.out.println("Eleman sayısı " + message.length());
        System.out.println("5. eleman " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("B")); // boolean değer döner. True or False
        System.out.println(message.startsWith("B"));
        char[] karakterler = new char[6];
        message.getChars(0,5, karakterler ,0);
        System.out.println(karakterler);
        System.out.println(message.indexOf('a'));

        // message stringinde kaç tane a harfi var
        char iharfi;
        int totalNumofi = 0;
        for ( int i= 0; i < message.length(); i++){
                  iharfi = message.charAt(i);
                  if (iharfi == 'a' ){
                      totalNumofi++;
                  }
        }
        System.out.println(totalNumofi); */

       /* String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(2));
        System.out.println(message.substring(2,5));

        for (String kelime : message.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));*/

        System.out.println(message.trim());
    }
}
