package br.com.alura.knowledge01;

public class Main04 {
    public static void main(String[] args){

        /*
         * Casting Implícito
         * Casting Explícito
         * Características Operações
         */

        int number1 = 2;
        double number2 = number1;
        System.out.println(number2);

        double number3 = 7.5;
        int number4 = (int) number3;
        System.out.println(number4);

        double number5 = 5 / 2;
        System.out.println(number5);
        double number6 = 5 / 2.0;
        System.out.println(number6);
        double number7 = 5.0 / 2;
        System.out.println(number7);

        System.out.println((int)number7);
    }
}
