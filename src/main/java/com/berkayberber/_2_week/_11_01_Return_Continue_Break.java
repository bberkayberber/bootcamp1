package com.berkayberber._2_week;

import java.util.*;

public class _11_01_Return_Continue_Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int number=Math.abs(scan.nextInt());
        int toplam=0;

        for(int i=1; i<=number;i++){
            if(number>=100){

                System.out.println("100'den büyük sayı girdimiz. 100'e kadar toplandı");
                break;
            }
            if(number == 47){
                System.out.println("girdiğiniz sayı 47 olduğundan 47 toplama dahil edilmedi");
                continue;
            }
            toplam +=i;

            System.out.println("Toplam : "+toplam);

            if(toplam % 2 == 0){
                System.out.println(toplam + " Toplam : Çifttir ");
            }
            else {
                System.out.println(toplam + " Toplam : Tektir");
            }
        }

    }
}
