package com.berkayberber._2_week;

import java.sql.*;

public class _12_01_String1 {
    public static void main(String[] args) {

        String vocabulary1 = " Java öğreNiYorum ";
        String vocabulary2 = " java öğreNiYorum ";

        //LENGHT
        System.out.println("String sayısı : "+ vocabulary1.length());

        // toUpperCase() hepsini büyük harf yapar. -- toLowerCase() hepsini küçük harfle yapar
        System.out.println("Büyük HARF : "+ vocabulary1.toUpperCase());
        System.out.println("küçük harf : "+ vocabulary1.toLowerCase());

        //TRİM  -- BASINDAKİ VEYA SONUNDAKİ BOŞLUKLARI ALIR
        System.out.println("Trim:" + vocabulary1.trim().length());
        System.out.println("Trim:" + vocabulary1.trim());

        // EQUALS eşit mi? ==  equalsIgnoreCase büyük küçük harf duyarlıgıgı yoktur
        System.out.println("==" +vocabulary1 == vocabulary2);
        System.out.println("equals :"+vocabulary1.equals(vocabulary2));
        System.out.println("equals İgnoreCase :"+vocabulary1.equalsIgnoreCase(vocabulary2));



        //startsWith() ile mi başlıyor
        //endsWith()  ile mi bitiyor"
        System.out.println(vocabulary1.startsWith("j")+ " ile mi başlıyor");
        System.out.println(vocabulary1.endsWith(" ")+ " ile mi bitiyor");


        //charAt  0'dan saymaya baslar ve verdiğiniz sayı ilgili kelimenin harfini verir
        System.out.println(vocabulary1.charAt(1));


        //subString Parçalama
        System.out.println(vocabulary1.substring(4));
        System.out.println(vocabulary1.trim().substring(4));
        System.out.println(vocabulary1.trim().substring(4).toUpperCase());
        System.out.println(vocabulary1.trim().substring(4).toLowerCase());
        System.out.println(vocabulary1.substring(4,10)); //VERİLEN ARALIKTAKİ KELİMELER HARİÇ PARÇALAR





    }
}
