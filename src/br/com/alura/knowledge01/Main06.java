package br.com.alura.knowledge01;

public class Main06 {
    public static void main(String[] args) {
        /*
         * Estrutura Condicional
         * IF
         */

        short number1 = 7;

        if(number1 == 7){
            System.out.println("Number Seven!");
        }

        /*
         * Operadores Relacionais
         * > < >= <= == !=
         */

        if((number1 % 2) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        if(number1 <= 10){
            System.out.println(number1 + " <= 10");
        }else if(number1 <= 20){
            System.out.println(number1 + " <= 20");
        }else{
            System.out.println(number1 + " > 20");
        }

    }
}
