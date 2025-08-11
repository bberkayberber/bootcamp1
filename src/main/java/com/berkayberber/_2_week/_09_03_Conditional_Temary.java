package com.berkayberber._2_week;

public class _09_03_Conditional_Temary {

    public static void main(String[] args) {

        int number=5;
        if(number>0){
            System.out.println("pozitif sayidir");
        }
        else{
            System.out.println("negatif sayidir");
        }
        // YADA
        String result = (number>0) ? "pozitif sayidir" : "negatif sayidir";
        System.out.println(result);
    }
}
