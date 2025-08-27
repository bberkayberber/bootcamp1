package com.berkayberber._2_week;

public class _13_01_MethodIsNotReturn {

    // 1- Metotlar  metot Returnsuz Parametresiz
    // Geri döndürülcek veri falan yoksa void kullanılır
    public void metotReturnsuzParametresiz(){

        System.out.println("metotReturnsuzParametresiz");
    }

    // 2- Metotlar Returnsuz Parametreli
    public static void metotReturnsuzParametreli(String name){
        System.out.println("metotReturnsuzParametrei: "+ name);
    }

    //overloading
    public static void metotReturnsuzParametreli(String name,String surname){
        System.out.println("metotReturnsuzParametrei: "+ name + " " +surname);
    }

    //new
    //Static
    public static void main(String[] args) {
        _13_01_MethodIsNotReturn data1 = new _13_01_MethodIsNotReturn();
        data1.metotReturnsuzParametresiz();

        //instance(new) olmadan çağırdım
        _13_01_MethodIsNotReturn.metotReturnsuzParametreli("BERKAY");
        _13_01_MethodIsNotReturn.metotReturnsuzParametreli("BERKAY","Berber");




    }
}
