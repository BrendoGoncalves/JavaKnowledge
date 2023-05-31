package br.com.alura.knowledge01;

public class Main03 {
    public static void main(String[] args){
        /*
         * Abreviações
         * Pré-Incremento
         * Pós-Incremento
         */

        int numberInteger1 = 1;

        //numberInteger1 = numberInteger1 + 1;
        numberInteger1 += 3;
        System.out.println(numberInteger1);

        int numberInteger2 = 2;
        System.out.println("Post Increment: " + numberInteger2++);
        System.out.println("Pre Increment: " + (++numberInteger2));
    }
}
