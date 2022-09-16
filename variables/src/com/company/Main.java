package com.company;

public class Main {

    public static void main(String[] args) {

        int ogreciSayisi = 10;
        String mesaj = "Öğrenci sayısı : ";

        System.out.println(mesaj + ogreciSayisi);
        System.out.println(mesaj + ogreciSayisi);
        System.out.println(mesaj + ogreciSayisi);
        System.out.println(mesaj + ogreciSayisi);
// 4 kere yazmak yerine for döngüsü ile tek adımda aynı mesajı görüntülenmesini sağlayabiliriz.
        for (int i = 0 ; i < 4 ; i ++){
            System.out.println(mesaj + ogreciSayisi);
        }
    }
}
