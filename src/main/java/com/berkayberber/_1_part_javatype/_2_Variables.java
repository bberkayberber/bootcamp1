package com.berkayberber._1_part_javatype;

public class _2_Variables {
    public static void main(String[] args) {
        // Veri değişken isimleri yazarken ;
        /*
            veri isimlendirmeleri;
            1- isim veya sıfat,  zamir kullanmamız lazım.
            2- _ veya $ ile başlayabiliriz
            3- sayı ile bitebilir
            4- sayı ile başlamaz
            5- _ veya $ dışında özel simgelerle başlanmaz
            6- değişken isimlerini camelCase kuralına göre yazılır
         */
        // Primitive Types 8 tanedir. null değer alınamaz
        //1- isim veya sıfat,  zamir kullanmamız lazım.
        // Anlamlı ve acıklayıcı isimler secilir.

        int schoolNumber = 25;
        System.out.println("schoolNumber = " + schoolNumber);
        schoolNumber = 344;
        System.out.println("schoolNumber = " + schoolNumber);

        int _schoolnumber = 25;
        System.out.println("_schoolnumber = " + _schoolnumber);

        int $schoolnumber = 25;
        System.out.println("$schoolnumber = " + $schoolnumber);

        int schoolNumber1 = 26;
        System.out.println("schoolNumber1 = " + schoolNumber1);

        //int 1schoolNumber = 26; // BÖYLE OLAMAZ

        //int %schoolNumber = 1; //  BÖYLE OLAMAZ

        //int school-Number = 123; // BÖYLE OLAMAZ

        // SABİT SAYILARIN YAZIMI

        int MAX_STUDENTS = 100;// EĞER FİNALY YAZILMAZSA
        System.out.println("MAX_STUDENDES = " + MAX_STUDENTS);
        MAX_STUDENTS = 1110;
        System.out.println("MAX_STUDENDES = " + MAX_STUDENTS);
        // YUKARDA MAX_STUDENTS 100'DEN 1110'A GÜNCELLENDİ

        final int MAX_STUDENTS1 = 110;






    }
}
