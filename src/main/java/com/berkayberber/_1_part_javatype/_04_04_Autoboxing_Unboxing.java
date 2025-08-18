package com.berkayberber._1_part_javatype;

public class _04_04_Autoboxing_Unboxing {
    public static void main(String[] args) {


        // Primitive → Wrapper
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing

        System.out.println("Wrapper Integer: " + wrapperValue);


        //Wrapper → Primitive

        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2; // Unboxing

        System.out.println("Primitive int: " + primitiveValue2);
          







    }
}
 