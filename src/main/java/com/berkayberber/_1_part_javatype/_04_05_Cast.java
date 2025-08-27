package com.berkayberber._1_part_javatype;

public class _04_05_Cast {
    public static void main(String[] args) {

        // 1- nideing cast

        byte cast1Byte = 100; // küçük olan veriyi
        int cast1Int = cast1Byte; // büyü olan veriye ekledim veri kaybı yoktur
        System.out.println(cast1Int);


        // 2-narrowing cast - explicit cast

        int cast2Int = 999999999;
        byte  cast2Byte =(byte) cast2Int;
        System.out.println(cast2Byte);


        // 3- char to int


        char cast3Char = '/';
        int ascii1 = cast3Char;
        System.out.println(cast3Char + " harfi ascii olarak karsılıgı " + ascii1);

        int cast3Int = 47;
        char ascii2 = (char) cast3Int;
        System.out.println(cast3Int + "sayısının acsii karsılıgı olarak  "+ ascii2);

        // 4-  string to int

        String cast4String = "10";
        int cast4Int1 = Integer.valueOf(cast4String);
        int cast4Int2 = Integer.parseInt(cast4String);
        System.out.println(cast4Int1 + 20);
        System.out.println(cast4String + 20);
        System.out.println(cast4Int2 + 20);


        // 5- integer to string

        int cast5Int = 55;
        String  cast5String = String.valueOf(cast5Int);
        System.out.println(cast5String + 10);





    }
}
