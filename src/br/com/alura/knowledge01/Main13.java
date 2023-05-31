package br.com.alura.knowledge01;

public class Main13 {
    public static void main(String[] args) {
        /*
         * Estrutura de Repetição
         * FOR
         */

        for(int count = 0; count < 5; count++){
            System.out.println(count);
        }

        for(int count1 = 0, count2 = 0 ; count1 < 4 && count2 > -3; count1++, count2--){
            System.out.println(count1 + " - " + count2);
        }

        short count = 7;
        for( ; count < 10; count++){
            System.out.println(count);
        }
    }
}
