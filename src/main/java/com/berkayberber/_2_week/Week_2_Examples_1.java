package com.berkayberber._2_week;

import java.util.*;

public class Week_2_Examples_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int number1 = scanner.nextInt();


        if (number1<0){
            System.out.println("Lütfen Pozitif Sayı Giriniz");
            number1=Math.abs(number1);
        }
        if(number1%2 ==0){
            System.out.println("girilen sayı çiftir");
        }
        else{
            System.out.println("Girilen sayı tektir ");
        }






    }
}
