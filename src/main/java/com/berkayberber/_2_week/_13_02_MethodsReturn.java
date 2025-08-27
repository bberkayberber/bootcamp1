package com.berkayberber._2_week;

public class _13_02_MethodsReturn {
    // 3- Returnlü parametresiz
    public String metotReturluParametresiz(){
        return "metotReturnlu Parametresiz";
    }

    // 4- Returnlu parametreli

    public Integer metotReturluParametreli(int number){
        return number;
    }

    //psvm
    public static void main(String[] args) {

        _13_02_MethodsReturn isReturn1 = new _13_02_MethodsReturn();

        String result1 = isReturn1.metotReturluParametresiz();
        System.out.println(result1);

        Integer result2 = isReturn1.metotReturluParametreli(1163);
        System.out.println(result2);
    }
}
