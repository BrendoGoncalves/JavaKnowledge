package br.com.alura.knowledge01;

public class Main09 {
    public static void main(String[] args){
        /*
         * Estrutura de Condição
         * Operador Ternário
         */

        double salary = 1000.0;

        double increase = salary * (salary > 1000.0 ?  0.1 : 0.15);
        System.out.println(increase);

        System.out.println(salary > 1000.0 ? "Blue" : "Red");
    }
}
