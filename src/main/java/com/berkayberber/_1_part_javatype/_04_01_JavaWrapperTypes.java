package com.berkayberber._1_part_javatype;

public class _04_01_JavaWrapperTypes {
    public static void main(String[] args) {

        // Primitive Types 8 tanedir. null değer alınamaz


        //Primitive Type
        byte primitiveTypeByte = 127;

        //primitiveTypeByte=null; // primitive typelar null değeri alamaz
        System.out.println(primitiveTypeByte);
        short primitiveTypeShort = 32767;
        int primitiveTypeInt = 2147483647;
        long primitiveTypeLong = 9223372036854775807L;

        float primitiveTypeFloat = 14.23f;
        double primitiveTypeDouble = 214.23;

        boolean primitiveTypeBoolean = true;
        char primitiveTypeChar = 'A';


        // Wrapper Type
        Byte wrapperTypeByte = 127;
        wrapperTypeByte=null;
        System.out.println(wrapperTypeByte);
        Short  wrapperTypeShort = 32767;
        Integer wrapperTypeInt = 2147483647;
        Long wrapperTypeLong = 9223372036854775807L;

        Float wrapperTypeFloat = 14.23f;
        Double wrapperTypeDouble = 214.23;

        Boolean wrapperTypeBoolean = true;
        Character wrapperTypeChar = 'A';



    }
}
