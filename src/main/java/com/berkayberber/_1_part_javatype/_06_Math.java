package com.berkayberber._1_part_javatype;

public class _06_Math {
    public static void main(String[] args) {
        // NAN : not a number
        System.out.println("En küçük: "+Math.min(-300,10));
        System.out.println("En büyük: "+Math.max(-300,10));

        System.out.println("Mutlak Değer: "+Math.abs(-10));

        System.out.println("Karekök: "+Math.sqrt(+25));
        System.out.println("Karekök: "+Math.sqrt(-25));
        System.out.println("Karekök: "+Math.sqrt(Math.abs(-25)));

        System.out.println("Üslü Sayı: "+Math.pow(2,6));

        System.out.println("Alt Yuvarla: "+Math.floor(2.9));
        System.out.println("Üst Yuvarla: "+Math.ceil(2.9));
        System.out.println("Üst Yuvarla: "+Math.ceil(2.0001));
        System.out.println("Üst Yuvarla: "+Math.round(3.4)); // x>=4 ise aşağı yuvarlar
        System.out.println("Üst Yuvarla: "+Math.round(3.5)); // x>=5 ise yukarı yuvarlar

        System.out.println("Pi Sayısı: "+ Math.PI);
        System.out.println("E Sayısı: "+ Math.E);

        System.out.println("Trigonometrik Sinüs: "+Math.sin(1));
        System.out.println("Trigonometrik ArcSinüs: "+Math.asin(1));

        System.out.println("Trigonometrik Cosinüs: "+Math.cos(1));
        System.out.println("Trigonometrik ArcCosinüs: "+Math.acos(1));

        System.out.println("Trigonometrik Tanjant: "+Math.tan(1));















    }
}

