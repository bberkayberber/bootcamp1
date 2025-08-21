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


        //Contains

        System.out.println("Geçiyor mu ? :"+vocabulary1.contains("Java"));

        //Replace
        vocabulary1 = vocabulary1.replace("Java","JAVA 2025");
        System.out.println("Değştir :" + vocabulary1.replace("Java","JAVA 2025"));
        System.out.println(vocabulary1);

        // Birleştirme
        String concatnation =vocabulary1 + vocabulary2 + vocabulary2;
        System.out.println(concatnation);
        System.out.println(vocabulary1.concat(" jsp").concat(" jsf"));


        // String Builder APİLERDE KULLANILIR DAHA HIZLIDIR
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vocabulary1).append(" jpp").append(" jsf");
        String dataToString1 = stringBuilder.toString();
        System.out.println(dataToString1);

        // String Buffer   DAHA MANTIKLIDIR
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(vocabulary1).append(" jpp").append(" jsf");
        String dataToString2 = stringBuffer.toString();
        System.out.println(dataToString2);

        System.out.println(vocabulary1.hashCode());
        System.out.println(vocabulary2.hashCode());






    }
}
