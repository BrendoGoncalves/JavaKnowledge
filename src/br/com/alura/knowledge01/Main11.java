package br.com.alura.knowledge01;

public class Main11 {
    public static void main(String[] args) {
        /*
         * Estrutura de Repetição
         * WHILE
         */

        byte count = 0;

        while(count < 5){
            System.out.println(count);
            count++;
        }

        while(count++ <= 10){
            System.out.println("Go! " + count);
        }
    }
}
